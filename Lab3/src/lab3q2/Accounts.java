package lab3q2;
//Student Name 	: Sarah Martin
//Student Id Number: C00257967
//Date 			: Oct-2021
//Purpose 			: Savings Account

public class Accounts {
	

	public static void main(String[] args) {
	
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00); 
		saver2.setSavingsBalance(3000.00);
		
		saver1.modifyInterestRate(.04); 
		saver2.modifyInterestRate(.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		
       saver1.modifyInterestRate(0.05); 
       saver2.modifyInterestRate(0.05); 
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		
		
		
	}

}
