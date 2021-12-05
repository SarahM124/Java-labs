package lab8;

public class Triangle extends TwoDShape {
	
	private double width; 
	private double height; 
	
	
	// Triangle constructor 
	public Triangle( String name, String colour,double width, double height) 
	{
		super(name, colour); 
		this.width = width; 
		this.height = height; 
		
	}
	
	// Triangle area method 
	public double area() {
		return  width * height;
	}
	
	
	

}
