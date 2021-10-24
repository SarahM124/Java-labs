package lab3q2; 

public class SavingsAccount {
	
	int accountNumber; // customer account number 
	 static double annualInterestRates = 0;
	 double savingsBalance; 
	int newAccountNumber = 1; 
	static double interest = 0;  
	
	
	SavingsAccount()
	{
		accountNumber = newAccountNumber;
		newAccountNumber++; 
		annualInterestRates = 0;
		savingsBalance = 0;  
	}
	
	public void setSavingsBalance(double savingsBalance)
	{
		this.savingsBalance = savingsBalance; 
	}
	
	
	
	
	
	public void calculateMonthlyInterest() // calculates the monthly interest 
	{
		System.out.println("Current balance: " + savingsBalance); 
		interest = (savingsBalance * annualInterestRates) / 12; 
		savingsBalance = interest;  
		System.out.println("New balance: " + savingsBalance); 
	}

	public static  void modifyInterestRate(double interest) // changes the monthly interest 
	{
		annualInterestRates = interest; 

	}
	




	
	
}
