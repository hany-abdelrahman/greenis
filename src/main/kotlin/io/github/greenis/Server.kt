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

package io.github.greenis

import io.grpc.Server
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger
import com.google.protobuf.ByteString

/**
 * Server that manages startup/shutdown of a `Greeter` server.
 *
 * Note: this file was automatically converted from Java
 */
class GreenisServer {

    private var server: Server? = null

    @Throws(IOException::class)
    private fun start() {
        /* The port on which the server should run */
        val port = 50051
        server = ServerBuilder.forPort(port)
                .addService(GreenisServerImpl())
                .build()
                .start()
        logger.log(Level.INFO, "Server started, listening on {0}", port)
        Runtime.getRuntime().addShutdownHook(object : Thread() {
            override fun run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down")
                this@GreenisServer.stop()
                System.err.println("*** server shut down")
            }
        })
    }

    private fun stop() {
        server?.shutdown()
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    @Throws(InterruptedException::class)
    private fun blockUntilShutdown() {
        server?.awaitTermination()
    }

    internal class GreenisServerImpl : GreenisServerGrpc.GreenisServerImplBase() {
        private val cache = HashMap<String, ByteString>()
        override fun put(request: PutRequest, responseObserver: StreamObserver<PutResponse>?) {
            logger.info("Received put request: $request")
            cache[request.key] = request.value

            val response = PutResponse
                    .newBuilder()
                    .setStatus(Status.OK)
                    .build()

            responseObserver?.onNext(response)
            responseObserver?.onCompleted()
        }

        override fun get(request: GetRequest, responseObserver: StreamObserver<GetResponse>?) {
            logger.info("Received get request $request")
            val key = request.key
            if (cache.containsKey(key)) {
                val value = cache[key]
                val response = GetResponse.newBuilder().setStatus(Status.OK).setValue(value).build()
                responseObserver?.onNext(response)
                responseObserver?.onCompleted()
            }
            else {
                val response = GetResponse.newBuilder().setStatus(Status.NOT_EXISTS).build()
                responseObserver?.onNext(response)
                responseObserver?.onCompleted()
            }
        }

        override fun contains(request: ContainsRequest, responseObserver: StreamObserver<ContainsResponse>?) {
            logger.info("Received contains request $request")
            val key = request.key
            val status = if (cache.containsKey(key)) Status.EXISTS else Status.NOT_EXISTS
            val response = ContainsResponse.newBuilder().setStatus(status).build()
            responseObserver?.onNext(response)
            responseObserver?.onCompleted()
        }

        override fun delete(request: DeleteRequest, responseObserver: StreamObserver<DeleteResponse>?) {
            logger.info("Received delete request $request")
            val key = request.key
            if (cache.containsKey(key)) {
                cache.remove(key)
                val response = DeleteResponse.newBuilder().setStatus(Status.OK).build()
                responseObserver?.onNext(response)
                responseObserver?.onCompleted()
            }
            else {
                val response = DeleteResponse.newBuilder().setStatus(Status.NOT_EXISTS).build()
                responseObserver?.onNext(response)
                responseObserver?.onCompleted()
            }
        }
    }

    companion object {
        private val logger = Logger.getLogger(GreenisServer::class.java.name)

        /**
         * Main launches the server from the command line.
         */
        @Throws(IOException::class, InterruptedException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val server = GreenisServer()
            server.start()
            server.blockUntilShutdown()
        }
    }
}