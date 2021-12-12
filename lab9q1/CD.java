package lab9q1;

public class CD extends LibraryItem {
	
	String band; 
	String title; 
	int numTracks; 
	

	
	public CD() {
		
	}
	
	public void calculatePrice(String name, double price, int quantity) {
		
	double totalPrice = (price * quantity);
	System.out.println("Name " + name + ",quantity " + quantity + " ,total price " + totalPrice);

	}

	
	

}
	

