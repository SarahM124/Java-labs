package Lab2;


public class Hotel {

	public static void main(String[] args) {
		
		HotelRoom roomA = new HotelRoom();		// Creates an instance of the HotelRoom class
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		
		// Room A
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setVacancy(1);
		roomA.setRate(100);
		System.out.println("room number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType() + " and the rate is " + roomA.getRate() + ". Vacancy: " + roomA.getVacancy());
		
		//Room B
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setRate(80);
		System.out.println("room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + " and the rate is " + roomB.getRate() + ". Vacancy: " + roomB.getVacancy());
		System.out.println("room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + " and the rate is " + roomB.getRate() + ". Vacancy: " + roomB.isOccupied());
		
		//Room C 
		System.out.println("room number is " + roomC.getRoomNumber() + ", type is " + roomC.getRoomType() + " and the rate is " + roomC.getRate() + ". Vacancy: " + roomC.getVacancy());
		
	}

}
