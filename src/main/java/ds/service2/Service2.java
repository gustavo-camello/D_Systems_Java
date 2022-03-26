package ds.service2;

import java.io.IOException;

import ds.service2.RequestMessage;
import ds.service2.ResponseMessage;
import ds.service2.Service2;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Random;

public class Service2 extends Service2ImplBase {
	public static void main(String[] args) throws InterruptedException, IOException {
		Service2 service2 = new Service2();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(service2)
				.build()
				.start();

		System.out.println("Service-1 started, listening on " + port);

		server.awaitTermination();
	}
	
	@Override
	public void checkPresence(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request
		String requestString = request.getText();
		
		Boolean randomCheck = Math.random() < 0.5;
	    String presence = "";
		
		if (randomCheck == true) {
			presence = "There is presence in the room";
		} else {
			presence = "There is no one in the room";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setText(presence).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
	
	@Override
	public void turnLightsOn(hasPrecense presence, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request
		hasPrecense checkPresence = presence;
		String lights = "";
		
		if (checkPresence != null) {
			lights = "Lights are ON";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setText(lights).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
	
	@Override
	public void turnLightsOff(hasPrecense presence, StreamObserver<ResponseMessage> responseObserver) {

		// Receive the request
		hasPrecense checkPresence = presence;
		String lights = "";
		
		if (checkPresence != null) {
			lights = "Switching the lights OFF in 30seg...";
		}
		
		// Preparing the response
		ResponseMessage reply = ResponseMessage.newBuilder().setText(lights).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}


}
