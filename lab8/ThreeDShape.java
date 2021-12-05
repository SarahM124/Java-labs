package lab8;

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
	
	public abstract double area(); // added in
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}