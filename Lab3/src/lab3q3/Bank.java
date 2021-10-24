package lab3q3;
//Student Name 	: Sarah Martin
//Student Id Number: C00257967
//Date 			: Oct-2021
//Purpose 			: Savings Account for a bank customer  
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankCustomer customer1 = new BankCustomer("Jeff Harrington", "32 Parkview Crescent, Newbridge Co. Kildare ");
		  
		
		System.out.println("Hi " + customer1.name + ", your address is: " + customer1.customerAddress);
		customer1.setBalance(2000);
		customer1.getBalance();
		
		customer1.addAccount(1);
		customer1.addAccount(3);
		customer1.accountNumber(222); 
		customer1.accountSummary();
		
		
		
		
		
		
		

	}

}
