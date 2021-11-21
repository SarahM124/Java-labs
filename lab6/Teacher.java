package lab6;
//Name : Sarah Martin
//Date : Nov-2021
//Purpose : A Teacher sub-class 


import java.util.Arrays;

class Teacher extends Person {

	
	// constructor 
	public Teacher(String name, String address) {
		super(name, address);
	}
	
	// variables 
	private int numCourses;
	private String[] courses = new String[10];


	// toString method 
	public String toString() {
		return "Teacher " + getName() + ", Address " + getAddress();
	}
	
	//methods
	public boolean addCourse(String course) {
	if(numCourses == 10)
	{
		return false;
	}
	else {
	courses[numCourses] = course;
	numCourses++;
	return true; 
	}
}



	public boolean removeCourse(String course)
{
	if(courses[numCourses] == course) 
	{
		courses[numCourses] = null;
		return false; 
	}
	else
	{
		return true; 
	}
}
	
	
	
}
