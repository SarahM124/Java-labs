package lab9q2;

public class Car implements ImportDuty{
	private String carType;
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

	// calculateDuty method for Car 
	public void calculateDuty() {
		int quantityOfVehicle = 2;
		double finalTax; 
		
		finalTax = (CARTAXRATE * 100) / quantityOfVehicle; 
		System.out.println("Your tax rate is: " + finalTax);
		
	}
}
