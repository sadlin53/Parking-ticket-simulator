package parkingTicketSimulator;

import javax.swing.JOptionPane;

public class TicketSimulator {
	
	public static void main(String[] args) {
		
		String cop;
		String badge;
		String make;
		String model;
		String color;
		String plates;
		String str;
		int carParked;
		int minutesPurchased;
		
		cop = JOptionPane.showInputDialog("What is the name of the police office?");
		badge = JOptionPane.showInputDialog("What is the officer's badge number?");
		
		PoliceOfficer officer = new PoliceOfficer(cop, badge);
		
		make = JOptionPane.showInputDialog("What was the make of the car?");
		model = JOptionPane.showInputDialog("What model was the car?");
		color = JOptionPane.showInputDialog("What color was the car?");
		plates = JOptionPane.showInputDialog("What was the license plate number on the car?");
		str = JOptionPane.showInputDialog("How many minutes was the car parked?");
		carParked = Integer.parseInt(str);
		
		ParkedCar car = new ParkedCar(make, model, color, plates, carParked);
		
		str = JOptionPane.showInputDialog("How many minutes were purchased on the meter?");
		minutesPurchased = Integer.parseInt(str);
		
		ParkingMeter meter = new ParkingMeter(minutesPurchased);
		
		officer.examineCar(car, meter);
		
	}
}
