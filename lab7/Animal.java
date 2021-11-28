package lab7;

public class Animal {
	
	protected String name; 
	private int age; 
	private char sex; 
	
	
	// Animal constructor 
	public Animal(String name, int age, char sex)
	{
		this.name = name; 
		this.age = age; 
		this.sex = sex; 
	}
	
	// methods 
	
	public void eat()
	{
		System.out.println(name + " is eating..."); 
	}
	
	public void sleep()
	{
		System.out.println(name + " is sleeping..."); 
	}

	public void makeSound() 
	{
		System.out.println(name + " is making a sound..."); 
	}
	
	public String toString()
	{
		return "name = " + name + ", age " + age + ", sex " + sex; 
	}
}
