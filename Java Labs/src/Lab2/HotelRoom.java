package Lab2;


public class HotelRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel roomA = new Hotel();		// Create an instance of our Thermometer class
		Hotel roomB = new Hotel();
		Hotel roomC = new Hotel(202, "Single", 0, 90);
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setVaccancy(1);
		roomA.setRate(100);
		System.out.println("room number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType() + " and the rate is " + roomA.getRate() + ". Vaccancy: " + roomA.getVaccancy());
		
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		//roomB.setVaccancy(0);
		roomB.setRate(80);
		System.out.println("room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + " and the rate is " + roomB.getRate() + ". Vaccancy: " + roomB.getVaccancy());
		System.out.println("room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + " and the rate is " + roomB.getRate() + ". Vaccancy: " + roomB.isOccupied());
		System.out.println("room number is " + roomC.getRoomNumber() + ", type is " + roomC.getRoomType() + " and the rate is " + roomC.getRate() + ". Vaccancy: " + roomC.getVaccancy());
		
	}

}
