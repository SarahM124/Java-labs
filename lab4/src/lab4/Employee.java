package lab4;
import java.util.Scanner;

// employee class
// Add employee (name, employee type)
// return employee record 
// toString to list employees 





public class Employee {
	Scanner sc = new Scanner(System.in);
	String employeeName;
	String employeeType; 
	static int newEmployeeNumber = 1000; 
	int employeeNumber; 
	Address employeeAddress  = new Address();
	Office employeeOffice = new Office() ; 
	Employee empdetails = new Employee(); 
	private String carInfo; 
	String info; 
	int numOfEmployees = 0; 
	String street;
	String town; 
	String county; 
	
	
	Employee() {
		this.employeeNumber = newEmployeeNumber; 
		
	}
	
	public void setEmployees() // creates an employee record if there isnt 5 employee records already made
	{ 
		if(numOfEmployees <= 5)
		{
		
		System.out.println("Enter employee name "); 
		 employeeName = sc.nextLine(); 
		 System.out.println(" Type of employee "); 
		 employeeType = sc.nextLine();
		 typeOfEmployee();
		  employeeOffice.assignEmployee(employeeNumber);
			System.out.println("Enter street name ");
			street = sc.nextLine();
			employeeAddress.setStreet(street); 
			System.out.println("Enter town name: ");
			town =  sc.nextLine();
			employeeAddress.setTown(town);
			System.out.println("Enter county: "); 
			county = sc.nextLine();
			employeeAddress.setCounty(county);
			employeeOffice.assignEmployee(employeeNumber);
		
		 newEmployeeNumber++; 
	}
	else 
	{
		System.out.println("Five employee records already exist"); 
	}
		 
		 
	}
	public String getEmployees()
	{
		return "Employee Name: " + employeeName + " " + "Employee type: " + employeeType; 
	}
	
	public String  typeOfEmployee() // returns carInfo setter method if employee is a manager, otherwise does not return anything 
	{
		
		
		if(employeeType.equalsIgnoreCase("Manager"))
		{
			return setCarInfo(); 
		}
		else if(employeeType.equalsIgnoreCase("Staff"))
		{
			return null; 
		}
		return null;
			 
	}
	
	
	
	public Address getemployeeAddress() // gets employee address 
	{
		return employeeAddress; 
	}
	
	public String setCarInfo() // sets car info for Manager 
	{
		System.out.println("Enter car model ");
		return info = sc.nextLine();
		
		
	}
	
	public String getCarInfo() // returns car info 
	{
		return info; 
	}

	public String toString() //toString method that returns employee record 
	{
		return "Employee " + ", employeeName=" + employeeName + ", employeeType=" + employeeType
				+ ", employeeNumber=" + employeeNumber + ", employeeAddress=" + employeeAddress + ", employeeOffice="
				+ employeeOffice + ", carInfo=" + carInfo + ", info=" + info + ", numOfEmployees=" + numOfEmployees
				+ ", street=" + street + ", town=" + town + ", county=" + county + "]";
	}

	
	
 
	

}
