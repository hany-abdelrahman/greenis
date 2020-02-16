package io.github.greenis;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greenis server definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: greenis.proto")
public final class GreenisServerGrpc {

  private GreenisServerGrpc() {}

  public static final String SERVICE_NAME = "greenis.GreenisServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.github.greenis.PutRequest,
      io.github.greenis.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = io.github.greenis.PutRequest.class,
      responseType = io.github.greenis.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.greenis.PutRequest,
      io.github.greenis.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<io.github.greenis.PutRequest, io.github.greenis.PutResponse> getPutMethod;
    if ((getPutMethod = GreenisServerGrpc.getPutMethod) == null) {
      synchronized (GreenisServerGrpc.class) {
        if ((getPutMethod = GreenisServerGrpc.getPutMethod) == null) {
          GreenisServerGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<io.github.greenis.PutRequest, io.github.greenis.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreenisServerMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.github.greenis.GetRequest,
      io.github.greenis.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = io.github.greenis.GetRequest.class,
      responseType = io.github.greenis.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.greenis.GetRequest,
      io.github.greenis.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.github.greenis.GetRequest, io.github.greenis.GetResponse> getGetMethod;
    if ((getGetMethod = GreenisServerGrpc.getGetMethod) == null) {
      synchronized (GreenisServerGrpc.class) {
        if ((getGetMethod = GreenisServerGrpc.getGetMethod) == null) {
          GreenisServerGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.github.greenis.GetRequest, io.github.greenis.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreenisServerMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.github.greenis.ContainsRequest,
      io.github.greenis.ContainsResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "contains",
      requestType = io.github.greenis.ContainsRequest.class,
      responseType = io.github.greenis.ContainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.greenis.ContainsRequest,
      io.github.greenis.ContainsResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<io.github.greenis.ContainsRequest, io.github.greenis.ContainsResponse> getContainsMethod;
    if ((getContainsMethod = GreenisServerGrpc.getContainsMethod) == null) {
      synchronized (GreenisServerGrpc.class) {
        if ((getContainsMethod = GreenisServerGrpc.getContainsMethod) == null) {
          GreenisServerGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<io.github.greenis.ContainsRequest, io.github.greenis.ContainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.ContainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreenisServerMethodDescriptorSupplier("contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.github.greenis.DeleteRequest,
      io.github.greenis.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = io.github.greenis.DeleteRequest.class,
      responseType = io.github.greenis.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.github.greenis.DeleteRequest,
      io.github.greenis.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.github.greenis.DeleteRequest, io.github.greenis.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = GreenisServerGrpc.getDeleteMethod) == null) {
      synchronized (GreenisServerGrpc.class) {
        if ((getDeleteMethod = GreenisServerGrpc.getDeleteMethod) == null) {
          GreenisServerGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.github.greenis.DeleteRequest, io.github.greenis.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.github.greenis.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreenisServerMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreenisServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreenisServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreenisServerStub>() {
        @java.lang.Override
        public GreenisServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreenisServerStub(channel, callOptions);
        }
      };
    return GreenisServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreenisServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreenisServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreenisServerBlockingStub>() {
        @java.lang.Override
        public GreenisServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreenisServerBlockingStub(channel, callOptions);
        }
      };
    return GreenisServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreenisServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreenisServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreenisServerFutureStub>() {
        @java.lang.Override
        public GreenisServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreenisServerFutureStub(channel, callOptions);
        }
      };
    return GreenisServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greenis server definition.
   * </pre>
   */
  public static abstract class GreenisServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Handle put key value pair request from the client
     * </pre>
     */
    public void put(io.github.greenis.PutRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handle get request from the client
     * </pre>
     */
    public void get(io.github.greenis.GetRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handle contains request from the client
     * </pre>
     */
    public void contains(io.github.greenis.ContainsRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.ContainsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handle delete request from the client
     * </pre>
     */
    public void delete(io.github.greenis.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.github.greenis.PutRequest,
                io.github.greenis.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.github.greenis.GetRequest,
                io.github.greenis.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getContainsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.github.greenis.ContainsRequest,
                io.github.greenis.ContainsResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.github.greenis.DeleteRequest,
                io.github.greenis.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greenis server definition.
   * </pre>
   */
  public static final class GreenisServerStub extends io.grpc.stub.AbstractAsyncStub<GreenisServerStub> {
    private GreenisServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreenisServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreenisServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handle put key value pair request from the client
     * </pre>
     */
    public void put(io.github.greenis.PutRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Handle get request from the client
     * </pre>
     */
    public void get(io.github.greenis.GetRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Handle contains request from the client
     * </pre>
     */
    public void contains(io.github.greenis.ContainsRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.ContainsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Handle delete request from the client
     * </pre>
     */
    public void delete(io.github.greenis.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.github.greenis.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greenis server definition.
   * </pre>
   */
  public static final class GreenisServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreenisServerBlockingStub> {
    private GreenisServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreenisServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreenisServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handle put key value pair request from the client
     * </pre>
     */
    public io.github.greenis.PutResponse put(io.github.greenis.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Handle get request from the client
     * </pre>
     */
    public io.github.greenis.GetResponse get(io.github.greenis.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Handle contains request from the client
     * </pre>
     */
    public io.github.greenis.ContainsResponse contains(io.github.greenis.ContainsRequest request) {
      return blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Handle delete request from the client
     * </pre>
     */
    public io.github.greenis.DeleteResponse delete(io.github.greenis.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greenis server definition.
   * </pre>
   */
  public static final class GreenisServerFutureStub extends io.grpc.stub.AbstractFutureStub<GreenisServerFutureStub> {
    private GreenisServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreenisServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreenisServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handle put key value pair request from the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.greenis.PutResponse> put(
        io.github.greenis.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Handle get request from the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.greenis.GetResponse> get(
        io.github.greenis.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Handle contains request from the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.greenis.ContainsResponse> contains(
        io.github.greenis.ContainsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Handle delete request from the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.greenis.DeleteResponse> delete(
        io.github.greenis.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_CONTAINS = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreenisServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreenisServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((io.github.greenis.PutRequest) request,
              (io.grpc.stub.StreamObserver<io.github.greenis.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.github.greenis.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.github.greenis.GetResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((io.github.greenis.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<io.github.greenis.ContainsResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.github.greenis.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.github.greenis.DeleteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreenisServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreenisServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.greenis.GreenisProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreenisServer");
    }
  }

  private static final class GreenisServerFileDescriptorSupplier
      extends GreenisServerBaseDescriptorSupplier {
    GreenisServerFileDescriptorSupplier() {}
  }

  private static final class GreenisServerMethodDescriptorSupplier
      extends GreenisServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreenisServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreenisServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreenisServerFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getContainsMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
