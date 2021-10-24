package lab3q3;
import java.util.Scanner;

public class BankCustomer {
	Scanner sc = new Scanner(System.in);
	
	String name;
	String customerName;
	String customerAddress;
	double SavingsAccounts = 0; 
	int accountNumber; 
	double balance; 
	double totalSavings; 
	
	BankCustomer(  String name, String address)
	{
		this.name = name;
		customerAddress = address;
	}
	
	
	public void addAccount(double savingsAccount) //checks if customer has more than 3 accounts, if not creates a new savings account
	{
		if(savingsAccount >= 3)
		{
			System.out.println("Can not create a new savings account, 3 savings accounts already exist");
		}
			
			else 
			{
				System.out.println("New savings account created");
				
				savingsAccount++; 
			}
		}
	
	public double accountNumber(double accountNumber) //assigns an account number 
	{
		this.accountNumber += accountNumber; 
		return accountNumber; 
	}
	

	public void setBalance(double balance) // sets customers account balance
	{
		this.balance = balance; 
	}
	
	public void getBalance() // prints customers account balance
	{
		balance = balance + totalSavings; 
		System.out.println("Your total balance is: " + balance);
		
	}
	
	public void accountSummary() // prints summary of customer account   
	{
		System.out.println("Account number: " + accountNumber + ", Account balance: " + balance);
	}

}
