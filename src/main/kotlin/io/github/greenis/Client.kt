package io.github.greenis

/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import com.google.protobuf.ByteString
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.StatusRuntimeException
import java.util.concurrent.TimeUnit
import java.util.logging.Level
import java.util.logging.Logger

/**
 * A simple client that requests a greeting from the [GreenisServer].
 */
class GreenisClient
/** Construct client for accessing Greenis server using the existing channel.  */
internal constructor(private val channel: ManagedChannel) {
    private val blockingStub = GreenisServerGrpc.newBlockingStub(channel)

    /** Construct client connecting to HelloWorld server at `host:port`.  */
    constructor(host: String, port: Int) : this(ManagedChannelBuilder.forAddress(host, port)
            // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
            // needing certificates.
            .usePlaintext()
            .build())

    @Throws(InterruptedException::class)
    fun shutdown() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }

    /** Say hello to server.  */
    fun putDataRange(count: Int) {
        logger.log(Level.INFO, "Putting $count records in greenis.")
        for (idx in 0 until count) {
            val request = PutRequest.newBuilder()
                    .setKey("key-$idx")
                    .setValue(ByteString.copyFromUtf8("value-$idx"))
                    .build()
            val response: PutResponse =  try {
                blockingStub.put(request)
            } catch (e: StatusRuntimeException) {
                logger.log(Level.WARNING, "RPC failed: {0}", e.status)
                return
            }
            logger.info("Greenis server responded with status: ${response.status}")
        }
    }

    fun getKeyRange(count: Int) {
        logger.log(Level.INFO, "Getting value for $count records in greenis.")
        for (idx in 0 until count) {
            val request = GetRequest.newBuilder()
                    .setKey("key-$idx")
                    .build()
            val response: GetResponse =  try {
                blockingStub.get(request)
            } catch (e: StatusRuntimeException) {
                logger.log(Level.WARNING, "RPC failed: {0}", e.status)
                return
            }
            logger.info("Greenis server responded with: ${response.value.toStringUtf8()}")
        }
    }

    companion object {
        private val logger = Logger.getLogger(GreenisClient::class.java.name)

        /**
         * Perform operations on server. If provided, the first element of `args` is the operation of  to use in the
         * greeting.
         */
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val client = GreenisClient("localhost", 50051)
            try {
                /* Access a service running on the local machine on port 50051 */
                val operation = if (args.isNotEmpty()) args[0] else "put"
                val count = if (args.isNotEmpty()) args[1].toInt() else 100
                if (operation == "put") {
                    client.putDataRange(count)
                } else if (operation == "get") {
                    client.getKeyRange(count)
                }
            } finally {
                client.shutdown()
            }
        }
    }
}