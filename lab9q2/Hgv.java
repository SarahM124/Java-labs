package lab9q2;

public class Hgv implements ImportDuty{
	private int cargo;

	public Hgv(){ 	
		this(0,0,0);	
	}

	public Hgv(int c, int w, int p){ 
		
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

	
	// calculateDuty method for Hgv
	public void calculateDuty() {
		int quantityOfVehicle = 2;
		double finalTax; 
		
		finalTax = (HGVTAXRATE * 100) / quantityOfVehicle; 
		System.out.println("Your tax rate is: " + finalTax);
		
	}	
}
