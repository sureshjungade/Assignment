package com.evalC2_2Que;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student1 = new Student();
		System.out.println("Enter number of objects needs to be created");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int averagemarks=0;
		Student[] Students = new Student[input];
		
		for(int i=0; i<Students.length; i++) {
			System.out.println("Enter Roll Number of Student");
			int roll = sc.nextInt();
			System.out.println("Enter Name of Student");
			String name = sc.next();
			
			System.out.println("Enter Address of Student");
			String address = sc.next();
			
			System.out.println("Enter Marks of Student");
			int marks = sc.nextInt();
			averagemarks = averagemarks+marks;
			Students[i] = new Student(roll,name,address,marks);
		}
		
		for(Student s1: Students) {
			System.out.println(s1);
		}
		System.out.println("Average marks of Students : "+averagemarks/input);
	}

}
