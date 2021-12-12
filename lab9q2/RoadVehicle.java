package lab9q2;

 class RoadVehicle implements ImportDuty {
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
 
	public RoadVehicle() {
 		this(0,0);	
	}
 
	public RoadVehicle(int w, int p) { 
		setWheels(w);
		setPass(p);
	}
 
	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}

	// calculateDuty method for RoadVehicle
	public void calculateDuty() {
		
		int quantityOfVehicle = 4;
		double finalTax; 
		
		finalTax = (CARTAXRATE * 100) / quantityOfVehicle; 
		System.out.println("Your tax rate is: " + finalTax);
		
		
		
	}
}
