package com.question_1st;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Student() {
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	public void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number");
		int roll = sc.nextInt();
		System.out.println("Enter student name");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		
		char grade = calculateGrade();
		
		setRoll(roll);
		setName(name);
		setMarks(marks);
		setGrade(grade);
		
		
	}
	
	
	
	
	private char calculateGrade() {
		//char grade;
		int marks = getMarks();
		
			if(marks>=500) {
				this.grade = 'A';
				System.out.println("a");
			}
			else if(marks<500 && marks>=400) {
				this.grade = 'B';
				System.out.println("b");
			}else {
				this.grade = 'C';
				System.out.println("c");
			}
			
				return grade;
			
			
			
	}

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
