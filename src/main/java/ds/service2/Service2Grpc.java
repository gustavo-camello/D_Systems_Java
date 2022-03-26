package ds.service2;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getCheckPresenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check_presence",
      requestType = ds.service2.RequestMessage.class,
      responseType = ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getCheckPresenceMethod() {
    io.grpc.MethodDescriptor<ds.service2.RequestMessage, ds.service2.ResponseMessage> getCheckPresenceMethod;
    if ((getCheckPresenceMethod = Service2Grpc.getCheckPresenceMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getCheckPresenceMethod = Service2Grpc.getCheckPresenceMethod) == null) {
          Service2Grpc.getCheckPresenceMethod = getCheckPresenceMethod = 
              io.grpc.MethodDescriptor.<ds.service2.RequestMessage, ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "check_presence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("check_presence"))
                  .build();
          }
        }
     }
     return getCheckPresenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.hasPrecense,
      ds.service2.ResponseMessage> getTurnLightsOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turn_lights_on",
      requestType = ds.service2.hasPrecense.class,
      responseType = ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.hasPrecense,
      ds.service2.ResponseMessage> getTurnLightsOnMethod() {
    io.grpc.MethodDescriptor<ds.service2.hasPrecense, ds.service2.ResponseMessage> getTurnLightsOnMethod;
    if ((getTurnLightsOnMethod = Service2Grpc.getTurnLightsOnMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getTurnLightsOnMethod = Service2Grpc.getTurnLightsOnMethod) == null) {
          Service2Grpc.getTurnLightsOnMethod = getTurnLightsOnMethod = 
              io.grpc.MethodDescriptor.<ds.service2.hasPrecense, ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "turn_lights_on"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.hasPrecense.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("turn_lights_on"))
                  .build();
          }
        }
     }
     return getTurnLightsOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.hasPrecense,
      ds.service2.ResponseMessage> getTurnLightsOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turn_lights_off",
      requestType = ds.service2.hasPrecense.class,
      responseType = ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.hasPrecense,
      ds.service2.ResponseMessage> getTurnLightsOffMethod() {
    io.grpc.MethodDescriptor<ds.service2.hasPrecense, ds.service2.ResponseMessage> getTurnLightsOffMethod;
    if ((getTurnLightsOffMethod = Service2Grpc.getTurnLightsOffMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getTurnLightsOffMethod = Service2Grpc.getTurnLightsOffMethod) == null) {
          Service2Grpc.getTurnLightsOffMethod = getTurnLightsOffMethod = 
              io.grpc.MethodDescriptor.<ds.service2.hasPrecense, ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "turn_lights_off"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.hasPrecense.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("turn_lights_off"))
                  .build();
          }
        }
     }
     return getTurnLightsOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkPresence(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckPresenceMethod(), responseObserver);
    }

    /**
     */
    public void turnLightsOn(ds.service2.hasPrecense request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnLightsOnMethod(), responseObserver);
    }

    /**
     */
    public void turnLightsOff(ds.service2.hasPrecense request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnLightsOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckPresenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.RequestMessage,
                ds.service2.ResponseMessage>(
                  this, METHODID_CHECK_PRESENCE)))
          .addMethod(
            getTurnLightsOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.hasPrecense,
                ds.service2.ResponseMessage>(
                  this, METHODID_TURN_LIGHTS_ON)))
          .addMethod(
            getTurnLightsOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.hasPrecense,
                ds.service2.ResponseMessage>(
                  this, METHODID_TURN_LIGHTS_OFF)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     */
    public void checkPresence(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckPresenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnLightsOn(ds.service2.hasPrecense request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnLightsOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnLightsOff(ds.service2.hasPrecense request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnLightsOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.service2.ResponseMessage checkPresence(ds.service2.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getCheckPresenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.service2.ResponseMessage turnLightsOn(ds.service2.hasPrecense request) {
      return blockingUnaryCall(
          getChannel(), getTurnLightsOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.service2.ResponseMessage turnLightsOff(ds.service2.hasPrecense request) {
      return blockingUnaryCall(
          getChannel(), getTurnLightsOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ResponseMessage> checkPresence(
        ds.service2.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckPresenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ResponseMessage> turnLightsOn(
        ds.service2.hasPrecense request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnLightsOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ResponseMessage> turnLightsOff(
        ds.service2.hasPrecense request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnLightsOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_PRESENCE = 0;
  private static final int METHODID_TURN_LIGHTS_ON = 1;
  private static final int METHODID_TURN_LIGHTS_OFF = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_PRESENCE:
          serviceImpl.checkPresence((ds.service2.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service2.ResponseMessage>) responseObserver);
          break;
        case METHODID_TURN_LIGHTS_ON:
          serviceImpl.turnLightsOn((ds.service2.hasPrecense) request,
              (io.grpc.stub.StreamObserver<ds.service2.ResponseMessage>) responseObserver);
          break;
        case METHODID_TURN_LIGHTS_OFF:
          serviceImpl.turnLightsOff((ds.service2.hasPrecense) request,
              (io.grpc.stub.StreamObserver<ds.service2.ResponseMessage>) responseObserver);
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

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getCheckPresenceMethod())
              .addMethod(getTurnLightsOnMethod())
              .addMethod(getTurnLightsOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
