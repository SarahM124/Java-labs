package lab7;

public class cat extends Animal {
	
	// cat constructor 
	public cat(String name, int age, char sex)
	{
		super(name, age, sex); 
	}
	
	// method 
	public void makeSound()
	{
		System.out.println(name + " is purring"); 
	}

}
