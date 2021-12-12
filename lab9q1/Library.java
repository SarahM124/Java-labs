package lab9q1;
//Author 			: Sarah Martin
//Date 			: Dec-2021
//Purpose 			: A test driver program for an array of LibraryItems

public class Library {

	public static void main(String[] args) {
		
		
		// create book and cd object and place them in an array 
		Book book1 = new Book();
		CD cd1 = new CD();
		 LibraryItem items[] = new LibraryItem[2]; 
		items[0] = book1;
		items[1] = cd1;
		
		 // calls calculate price method on cd and book objects 
		 cd1.calculatePrice("Graduation ", 2.50, 2);
		 book1.calculatePrice("Wizard of OZ ", 1.50, 3);
		 
		 for(int i = 0; i < items.length; i++)
		 {
			 System.out.println(items[i]);
		 }
	
		
		

	}

}
