package lab3q1;
//Student Name 	: Sarah Martin
//Student Id Number: C00257967
//Date 			: Oct-2021
//Purpose 			:  Program terminates after the stored time advances to the next minute

import java.util.Calendar;
import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		long currentTime = System.currentTimeMillis(); 
		long time = System.currentTimeMillis(); 
		t.tick();

		
		
		
		
		do
		{
			if(time - currentTime >= 1000) // checks when time is greater than or equal to a minute
			{
				t.tick(); 
				System.out.println(t.toString());
				currentTime = time; 
				
			}
			
		}
		while(t.getSecond() !=0); // loop continues until the t.getSecond method isnt at 0 
		
		
		
		
		
		
		

	}

}
