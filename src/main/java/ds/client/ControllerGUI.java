package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ds.service1.Service1Grpc;
import ds.service2.Service2Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ControllerGUI implements ActionListener{
	private JTextField responseField;
	
	private JPanel alarmJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Alarms")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton buttonOn = new JButton("Alarm ON");
		buttonOn.addActionListener(this);
		panel.add(buttonOn);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JButton buttonOff = new JButton("Alarm OFF");
		buttonOff.addActionListener(this);
		panel.add(buttonOff);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		responseField = new JTextField("", 10);
		responseField .setEditable(false);
		panel.add(responseField);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel lightSensorsJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Light Sensors")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton buttonOn = new JButton("LightSensors ON");
		buttonOn.addActionListener(this);
		panel.add(buttonOn);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JButton buttonOff = new JButton("LightSensors OFF");
		buttonOff.addActionListener(this);
		panel.add(buttonOff);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		responseField = new JTextField("", 10);
		responseField .setEditable(false);
		panel.add(responseField);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel panicAlarmJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Panic Alarm")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JButton buttonOff = new JButton("Active Panic Alarm");
		buttonOff.addActionListener(this);
		panel.add(buttonOff);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		responseField = new JTextField("", 10);
		responseField .setEditable(false);
		panel.add(responseField);

		panel.setLayout(boxlayout);

		return panel;
	}
	
	private JPanel roomsLightSensorJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Room Sensor Lights")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JButton buttonOff = new JButton("Check Presence");
		buttonOff.addActionListener(this);
		panel.add(buttonOff);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		responseField = new JTextField("", 10);
		responseField .setEditable(false);
		panel.add(responseField);

		panel.setLayout(boxlayout);

		return panel;
	}
	
	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( alarmJPanel() );
		panel.add( lightSensorsJPanel() );
		panel.add( panicAlarmJPanel() );
		panel.add(roomsLightSensorJPanel());

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Alarm ON")) {
			System.out.println("service 1 - Alarms is invoked to switch ON the Alarms...");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setMessage("Alarm ON").build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.activeAlarm(request);

			responseField.setText( response.getMessage() );
		
		} else if (label.equals("Alarm OFF")) {
			System.out.println("service 1 - Alarms is invoked to switch OFF the Alarms...");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setMessage("Alarm OFF").build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.activeAlarm(request);

			responseField.setText( response.getMessage() );
		
		} else if (label.equals("LightSensors ON")) {
			System.out.println("service 1 - Light Sensors is invoked to switch ON the Light Sensors...");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setMessage("LightSensor ON").build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.activeLightSensors(request);

			responseField.setText( response.getMessage() );
			
		} else if (label.equals("LightSensors OFF")) {
			System.out.println("service 1 - Light Sensors is invoked to switch OFF the Light Sensors...");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setMessage("LightSensor OFF").build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.activeLightSensors(request);

			responseField.setText( response.getMessage() );
			
		} else if (label.equals("Active Panic Alarm")) {
			System.out.println("service 1 - Active Panic Alarm is invoked to switch ON the Active Panic Alarm...");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setMessage("Active Panic Alarm").build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.activePanicAlarm(request);

			responseField.setText( response.getMessage() );
			
		} else if (label.equals("Check Presence")) {
			System.out.println("service 2 - Check the presence in a room and switch on or off the lights");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText("Sensor Reading...").build();

			//retreving reply from service
			ds.service2.ResponseMessage response = blockingStub.checkPresence(request);
			
			// TODO: NEEDS A WAY TO CONVERT THE PRESENCE RESPONSE TO A BOOLEAN, THAN UNCOMMENT THE CODE BELOW
			
//			// Switch the lights on response
//			ds.service2.hasPrecense request2 = ds.service2.hasPrecense.newBuilder().setPresence(Boolean.valueOf(response)).build();
//			ds.service2.ResponseMessage response2 = blockingStub.turnLightsOn(request2);
//			
//			// Switch the lights off when sensor is not reading a presence
//			ds.service2.hasPrecense request3 = ds.service2.hasPrecense.newBuilder().setPresence(Boolean.valueOf(response)).build();
//			ds.service2.ResponseMessage response3 = blockingStub.turnLightsOff(request2);
			

			responseField.setText( response.getText() );
		}
	}
}
