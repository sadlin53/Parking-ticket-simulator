package parkingTicketSimulator;


public class ParkingTicket {
	
	private ParkedCar car;
	private PoliceOfficer officer;
	private ParkingMeter meter;

	public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter meter)
	{
		this.car = car;
		this.officer = officer;
		this.meter = meter;
		
	}
	
	public String getColor()
	{
		return car.getColor();		
	}
	
	public double getFine()
	{
		int illegalMinutes = car.getMinutesParked() - meter.getMinutesPurchased();
		double fine = 0;
		
		if (illegalMinutes >= 60)
		{
			fine += 25.00;
			illegalMinutes -= 60;
		}
		
		while (illegalMinutes > 0)
		{
			if(illegalMinutes >= 60)
			{
				fine += 10.00;
				illegalMinutes -= 60;
			}
			
			else 
			{ 
				fine += 10.00;
				illegalMinutes -= illegalMinutes;
			}
		}
		return fine;
	}
	
	public String getLicense()
	{
		return car.getLicenseNumber();
	}
	
	public String getMake()
	{
		return car.getMake();
	}
	
	public String getModel()
	{
		return car.getModel();
	}
	
	public String getBadgeNumber()
	{
		return officer.getBadgeNumber();
	}
	
	public String getOfficerName()
	{
		return officer.getName();
	}
}
	
	
	

