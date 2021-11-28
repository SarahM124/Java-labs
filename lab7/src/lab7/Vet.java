package lab7;

public class Vet {

	private String name;

	// constructor 
	public Vet(String name) {
		this.name = name; 
		
	} 
	
	// vaccinate method 
	
	public void vaccinate(Animal animal) 
	{
		System.out.println(name + " is vaccinating..."); 
	
		if(animal instanceof Dog) 
		{
			System.out.println("Dog has been vaccinated: " + animal);
		}
		else if(animal instanceof cat) 
		{
			System.out.println("Cat has been vaccinated " + animal ); 
		}
		
	
	
		
		
		
	}
	
}
