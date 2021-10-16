package Lab2;

public class HotelRoom {

private int roomNumber;
private String roomType; 
private int occupancy; 
private int vacancy; 
	private double rate; 
 

public HotelRoom()  // constructor method #1
{
	setRoomNumber(0);
	setRoomType("");
	setVacancy(0);
	setRate(0); 
	
}

public HotelRoom(int number, String type, int vacancy, double price) // constructor method #2 takes 4 values as arguments
{
	roomNumber = number; 
	roomType = type; 
	occupancy = vacancy;  
	rate = price; 
}


public void setVacancy(int number) // vacancy setter
{
	occupancy = number; 
}  
public int getVacancy()
{
	return occupancy; 
}
  

public void setRate(double number)  // setter method for hotel rate
{
	rate = number; 
}

public double getRate()  // getter method for hotel rate
{
	return rate; 
}





public void setRoomNumber(int number)  // setter method for room number
{
	
	roomNumber = number; 
}

public int getRoomNumber()	 // getter method for room number
{
	return roomNumber; 
}


public void setRoomType(String room) // setter method for room type
{
	roomType = room; 
}
public String getRoomType() // getter method for room type
{
	return roomType; 
}

public boolean isOccupied() // method to check if room is occupied
{
	if(vacancy == 1)
	{
		return true;
	}
	else if(vacancy == 0)
	{
		return false; 
	}
	return false;
}
	
public void setOccupied() // method to set occupancy 
{
	if(isOccupied() == true )
	{
		 System.out.println("Room is already occupied"); 
		
	}
	else if(isOccupied() == false)
	{
		System.out.println("Room is vacant");
	}
	
}


}







