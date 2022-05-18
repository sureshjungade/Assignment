package com.first_project;

public class Student {
	int roll;
	String name;
	int marks;
	
	
	public void displayStudentDetails(int r,String n, int m) {
		System.out.println("Roll is :" + r);
		System.out.println("Name is :" + n);
		System.out.println("Marks is :" + m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentDetaisObj1 = new Student();
		studentDetaisObj1.roll = 22;
		studentDetaisObj1.name = "Suresh";
		studentDetaisObj1.marks = 100;
		
		studentDetaisObj1.displayStudentDetails(studentDetaisObj1.roll,studentDetaisObj1.name,studentDetaisObj1.marks);
		
		Student studentDetaisObj2 = new Student();
		studentDetaisObj2.roll = 35;
		studentDetaisObj2.name = "Gaurav";
		studentDetaisObj2.marks = 95;
		
		studentDetaisObj2.displayStudentDetails(studentDetaisObj2.roll,studentDetaisObj2.name,studentDetaisObj2.marks);
		
		studentDetaisObj1=null;
		studentDetaisObj2=null;
				
	}

}
