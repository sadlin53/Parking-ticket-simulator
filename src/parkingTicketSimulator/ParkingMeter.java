package parkingTicketSimulator;

public class ParkingMeter {
	
	private int minutesPurchased;
	
	public ParkingMeter(int minutesPurchased) 
	{
		this.minutesPurchased = minutesPurchased;
	}
	
	public int getMinutesPurchased()
	{
		return minutesPurchased;
	}
	
	public void setMinutesPurchased(int minutesPurchased)
	{
		this.minutesPurchased = minutesPurchased;
	}
	
}



