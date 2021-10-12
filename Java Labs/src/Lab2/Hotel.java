package Lab2;

public class Hotel {

private int roomNumber;
private String roomType; 
private int occupancy; 
private int vaccancy; 
	private double rate; 
 

public Hotel()
{
	setRoomNumber(0);
	setRoomType("");
	setVaccancy(0);
	setRate(0); 
	
}

public Hotel(int number, String type, int vacancy, double price)
{
	roomNumber = number; 
	roomType = type; 
	occupancy = vacancy;  
	rate = price; 
}

public void hotel(int occupancy)
{
	setVaccancy(occupancy); 
}

public void setVaccancy(int number)
{
	occupancy = number; 
}  
public int getVaccancy()
{
	return occupancy; 
}
  

public void hotel(double rate)
{
	setRate(rate); 
}
public void setRate(double number)
{
	rate = number; 
}

public double getRate()
{
	return rate; 
}



public Hotel(int roomNumber)
{
	setRoomNumber(roomNumber);
}


public void setRoomNumber(int number) 
{
	
	roomNumber = number; 
}

public int getRoomNumber()
{
	return roomNumber; 
}


public Hotel(String room)
{
	setRoomType(room); 
}

public void setRoomType(String room)
{
	roomType = room; 
}
public String getRoomType()
{
	return roomType; 
}

public boolean isOccupied()
{
	if(vaccancy == 1)
	{
		return true;
	}
	else if(vaccancy == 0)
	{
		return false; 
	}
	return false;
}
	
public boolean setOccupied()
{
	if(isOccupied() == false )
	{
		 System.out.println("Room is already occupied"); 
	}
	else if(isOccupied() == true)
	{
		return false; 
	}
}


}







