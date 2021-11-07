package lab4;
//Student Name 	: Sarah Martin
//Student Id Number: C00257967
//Date 			: Nov-2021
//Purpose 			:  HR system 

import java.util.Scanner;

public class MyHr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice; 
		 
		Office[] offices = new Office[3]; 
		Office listOffices = new Office();
		Employee newEmployee = new Employee(); 

		
		
		do {
		System.out.println(); 
		System.out.println("1: List all offices "); 
		System.out.println("2: Create an employee record ");
		System.out.println("3: List all employees ");
		System.out.println("4: Exit "); 
	
		
		
			System.out.println("Please choose an option ");
			choice = sc.nextInt(); 
			
			
			switch(choice)
			{
			case 1: System.out.println("List all offices"); 
			listOffices.toString();
			
			break; 
			case 2: System.out.println("Create an employee record"); 
			newEmployee.setEmployees();
			
			break; 
			case 3: System.out.println("List all employees ");
			newEmployee.getEmployees();
			break;
			case 4: System.out.println("Exit ");
			}
		}
			while(choice != 4);
		
		}

		
		
		
		
	
	}
		
	
		
		
	

		

