package lab4;

public class Office {
	
	// assign office number 
	// toString method 
	int roomNumber; 
	private static int newRoomNumber = 100; 
	private Employee[] twoEmployees = new Employee[2]; 
	
	
	
	public Office() {
	
	
	
		
	}
	

	public void assignEmployee(int employee) // assigns an employee to a room if it isnt already full 
	
	{
		for(int index = 0; index < twoEmployees.length; index++)
		if(twoEmployees.length== 0)
		{
			employee++; 
		}
		else if(twoEmployees.length >=2 )
		{
			System.out.println("Office is full ");
		}
		
	}
	
	public void setRoomNumber()
	{
		roomNumber = newRoomNumber; 
		newRoomNumber++; 
	}
	
	public int getRoomNumber()
	{
		return roomNumber; 
		
	}
	
	public String toString() // toString method to return office room number 
	{
		return "Office [roomNumber" + roomNumber + " ] ";
	}



	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
