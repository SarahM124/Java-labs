package lab9q2;

//Author 		: Sarah Martin
//Date 			: Dec-2021
//Purpose 		: A test driver program to test the ImportDuty interface

public class Driver {

	public static void main(String[] args) {
		
		RoadVehicle vehicle1 = new RoadVehicle();
		Car car1 = new Car();
		Hgv hgv1 = new Hgv();
		
		vehicle1.calculateDuty();
		car1.calculateDuty();
		hgv1.calculateDuty();
	}

}
