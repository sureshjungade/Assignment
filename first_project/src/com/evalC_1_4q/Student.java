package com.evalC_1_4q;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student() {
		
	}
	
	public Student(int rollNumber,String studentName, int marks) {
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	public void setRoll(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setName(String studentName) {
		this.studentName=studentName;
	}
	
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	public int getmarks() {
		return marks;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getRoll() {
		return rollNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		
	}

}



