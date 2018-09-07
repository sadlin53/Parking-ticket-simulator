package parkingTicketSimulator;

public class PoliceOfficer {
	
	private String name;
	private String badgeNumber;
	
	public PoliceOfficer(String name, String badgeNumber) 
	{
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	public void examineCar(ParkedCar car, ParkingMeter meter)
	{
		if (meter.getMinutesPurchased() < car.getMinutesParked())
		{
			ParkingTicket ticket = new ParkingTicket(car, this, meter);
			
			System.out.println(car.getMake() + " " + car.getModel() + "\n" + "license plate number:" + car.getLicenseNumber() + ""
					+ "\nis illegally parked. you get a ticket");
			
			System.out.println("\n--------Parking ticket--------");
			System.out.println("Issuing Officer's name: " + ticket.getOfficerName());
			System.out.println("Issuing Officer's badge number: " + ticket.getBadgeNumber());
			System.out.println("Fine: $" + ticket.getFine());
		}
		
		else
		{
			System.out.println(car.getModel() +  " is legally parked");
		}
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	public String getBadgeNumber()
	{
		return badgeNumber;
	}
	
}



