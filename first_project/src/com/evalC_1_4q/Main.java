package com.evalC_1_4q;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student object = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter");
		int noofS = scanner.nextInt();
		
		for(int i=0; i<noofS; i++) {
			System.out.println("Enter the Roll Number");
			object.setRoll(scanner.nextInt());
			int R = scanner.nextInt();
			System.out.println("Enter the Name");
			object.setName(scanner.next());
			String N = scanner.next();
			
			scanner.nextLine();
			System.out.println("Enter the marks");
			object.setmarks(scanner.nextInt());
			int M = scanner.nextInt();
			//new Student(R,N,M);
			System.out.println("Student Detail: "+(i+1));
			System.out.println("Student Roll Number: "+object.getRoll());
			System.out.println("Student Name: "+object.getName());
			System.out.println("Student Marks: "+object.getmarks());
		}
		
		
	}

}
