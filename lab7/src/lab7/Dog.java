package lab7;

public class Dog extends Animal {
	
	
	// constructor 
	public Dog(String name, int age, char sex) 
	{
		super(name, age, sex); 
	}
	
	// makeSound method 
	public void makeSound() 
	{
		System.out.println(name + " is barking..."); 
	}

}
