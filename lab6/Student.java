package lab6;
//Name : Sarah Martin
//Date : Nov-2021
//Purpose : A Student sub-class 

import java.util.Arrays;

class Student extends Person {
	
	// Variables
	private int numCourses; 
	private String[] courses = new String[10]; 
	private int[] grades = new int[10]; 
	
	
	
 // Constructor 
	public Student(String name, String address) {
		super(name, address);
		
	
	}



	// toString method
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + ", toString()=" + super.toString() + "]";
	}
	
	
	// Methods 
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade; 
		numCourses++; 
		
	}
	
	public void printGrades() {
		System.out.println("Student grades: "); 
		for(int i =0; i < numCourses; i++)
		{
			System.out.println(courses[i] + " : " + grades[i]); 
		}
		
	}
	
	public double getAverageGrade() {
		double total = 0; 
		for(int i =0; i < numCourses; i++)
		{
			total = total + grades[i]; 
		}
		double avg = total / numCourses; 
		return avg; 
	}
	
	
}

