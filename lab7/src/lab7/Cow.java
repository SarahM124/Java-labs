package lab7;

public class Cow extends Animal {
	
	
	// constructor 
	public Cow(String name, int age, char sex)
	{
		super(name, age, sex); 
	}
	
	// makeSound method
	public void makeSound() {
		System.out.println(name + " is mooing"); 
	}
	

}
