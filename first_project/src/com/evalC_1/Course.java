package com.evalC_1;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void setId(int courseId) {
		this.courseId=courseId;
	}
	
	public void setName(String courseName) {
		this.courseName=courseName;
	}
	
	public void setFee(int courseFee) {
		this.courseFee=courseFee;
	}
	
	public void displayCourseDetails() {
		
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	public static void authenticate(String username, String password) {
		
		if(username=="Admin" && password=="1234") {
			Course obj1 = new Course();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter courseId");
			obj1.setId(scanner.nextInt());
			
			System.out.println("Enter courseName");
			obj1.setName(scanner.next());
			
			scanner.nextLine();
			
			System.out.println("Enter courseFee");
			obj1.setFee(scanner.nextInt());
			
			obj1.displayCourseDetails();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course obj = new Course();
		
		obj.authenticate("Admin","1234");

	}

}
