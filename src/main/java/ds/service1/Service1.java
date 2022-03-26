package ds.service1;

import java.io.IOException;

import ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service1 extends Service1ImplBase{
	
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
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setMessage(alarmState).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}

}
