package labq2;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Brian", 3500);
		Student student = new Student("Lee", "Maths"); 
		
		
		Person[] persons = new Person[2]; 
		persons[0] = employee;
		persons[1] = student; 
		
		for(int i = 0; i < 2; i++) 
		{
			System.out.println("name " + persons[i].getName());
			System.out.println("Description " + persons[i].getDescription());
			
		}
	}

}
