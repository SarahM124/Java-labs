package lab2bq1;

public class createRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleLength = new Rectangle();
		//Rectangle rectangleWidth = new Rectangle(); 
		
		
		
		rectangleLength.setSize(4, 10);
		
		
		System.out.println(rectangleLength.toString());
		System.out.println(rectangleLength.getArea()); 
		System.out.println(rectangleLength.getPerimeter());
		rectangleLength.printRectangle();
	}
}


