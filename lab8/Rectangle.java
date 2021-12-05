package lab8;


// Rectangle constructor 
public class Rectangle extends TwoDShape {
	
	private double width; 
	private double height; 
	
	public Rectangle(String name, String colour, double width, double height) 
	{
		super(name, colour); 
		this.width = width; 
		this.height = height; 
		
	}

	// Rectangle area method 
	public double area() {
		return  width * height;
	}

}
