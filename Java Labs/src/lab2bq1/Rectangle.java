package lab2bq1;

public class Rectangle {
	
	private double length; 
	private double width; 
	private double area;
	private double perimeter; 
	
		
	
	public Rectangle()			// constructor method 
	{
		length = 1;
		width = 1;
		area = 0; 
		perimeter = 0; 
	}
	
	public void setSize(double length, double width) // Setter method for length and width of rectangle
	{
		if(length > 0.0 && length <= 40.0)
			this.length = length; 
		if(width > 0.0 && width <= 40.0)
			this.width = width; 
	}
	
	public double getLength() // getter method for length
	{
		return length; 
	}
	
	public double getWidth() // getter method for width
	{
		return width; 
	}
	
	public String toString() //toString method
	{
		return "Length = " + this.length + ", Width = " + this.width; 
	}
	
	public double getArea() //Method to get the area 
	{
		return this.length * this.width; 
	}
	
	public double getPerimeter() //method to get the perimeter 
	{
		return (this.length * this.width)*2; 
	}
	
	public void printRectangle() //Prints out rectangle using asterisks 
	{
		int i; 
		int j; 
		
		for(i = 1;  i <= length; i++)
		{
			
			
			for(j = 1; j <= width; j++)
			{
				if(i ==1 || i== length || j ==1 || i==width) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				if(i ==10 || i== length || j ==10 || i==width)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	

}
