package myProject;

public class Room {
	
	public int numberRoom;
	public char typeRoom;
	
	private String guestName;
	private double price;
	
	public Room(int numberRoom, char typeRoom)
	{
		this.numberRoom = numberRoom;
		this.typeRoom   = typeRoom;
	}
	
	public String getGuestName()
	{
		return this.guestName;
	}

	public void setGuestName(String gn)
	{
		this.guestName = gn;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void rentRoom(String guestName, double price)
	{
		setGuestName(guestName);
		setPrice(price);
	}
}
