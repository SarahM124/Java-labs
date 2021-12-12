package lab9q1;

public class Book extends LibraryItem {
	
	String author;
	String title; 
	int numPages;
	double price = 0; 
	double bookPrice = 3.0; 
	int quantity = 0; 
	
	public Book() {
		
	}
	
	
	public void calculatePrice(String name, double price, int quantity) {
		
		double totalPrice = (price * quantity);
		System.out.println("Name " + name + ",quantity " + quantity + " ,total price " + totalPrice);

		}

}
