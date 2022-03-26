package ds.service1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Logger;

import ds.service1.Service1Grpc.Service1ImplBase;

public class Service1 extends Service1ImplBase {
	public static void main(String[] args) throws InterruptedException, IOException {
		Service1 service1 = new Service1();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service-1 started, listening on " + port);

		server.awaitTermination();
	}
	
	@Override
	public void activeAlarm(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request, and depending on the message switch on and off the alarms.
		String requestString = request.getMessage();
		String alarmState = "";
		
		if (requestString.equals("Alarm ON")) {
			alarmState = "The Alarm is ON";
		} else if (requestString.equals("Alarm OFF")) {
			alarmState = "The Alarm is OFF";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setMessage(alarmState).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
	
	@Override
	public void activeLightSensors(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request, and depending on the message switch on and off the alarms.
		String requestString = request.getMessage();
		String sensorsState = "";
		
		if (requestString.equals("LightSensor ON")) {
			sensorsState = "The LightSensor is ON";
		} else if (requestString.equals("LightSensor OFF")) {
			sensorsState = "The LightSensor is OFF";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setMessage(sensorsState).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
	
	@Override
	public void activePanicAlarm(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request, and depending on the message switch on and off the alarms.
		String requestString = request.getMessage();
		String panicAlarm = "";
		
		if (requestString.equals("Active Panic Alarm")) {
			panicAlarm = "Panic Alarm Activeted";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setMessage(panicAlarm).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}

}

//public class Service1 {
//	private static final Logger logger = Logger.getLogger(Service1.class.getName());
//	
//	private Server server;
//
//	  private void start() throws IOException {
//	    /* The port on which the server should run */
//	    int port = 50051;
//	    server = ServerBuilder.forPort(port)
//	        .addService(new Service1Impl())
//	        .build()
//	        .start();
//	    logger.info("Server started, listening on " + port);
//	    
//	  }
//	  
//	  public static void main(String[] args) throws IOException, InterruptedException {
//	    final Service1 server = new Service1();
//	    server.start();
//	  }
//	  
//	  static class Service1Impl extends Service1Grpc.Service1ImplBase {
//
//	    @Override
//	    public void activeAlarm(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
//
//			// Receive the request, and depending on the message switch on and off the alarms.
//			String requestString = request.getMessage();
//			String alarmState = "";
//			
//			if (requestString.equals("Alarm ON")) {
//				alarmState = "The Alarms are ON";
//			} else if (requestString.equals("Alarm OFF")) {
//				alarmState = "The Alarms are OFF";
//			}
//			
//			// Preparing the response
//			ResponseMessage reply = ResponseMessage.newBuilder().setMessage(alarmState).build();
//
//			responseObserver.onNext( reply ); 
//
//			responseObserver.onCompleted();
//
//		}
//	
//	  }
//	  
//}

























