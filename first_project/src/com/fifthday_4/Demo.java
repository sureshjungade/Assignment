package com.fifthday_4;

import java.util.Scanner;

public class Demo{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of objects needs to bee created");
		int arrsize = sc.nextInt();
		Student [] arr = new Student[arrsize];
		int avgmarks = 0;
		
		for(int i=0; i<arrsize; i++) {
			arr[i] = new Student();
			//arr[i].name="Suresh";
			System.out.print("Enter the name of the student " + (i + 1) + " : ");
			arr[i].setName(sc.next());
			
			System.out.print("Enter the roll of the student " + (i + 1) + " : ");
			arr[i].setRoll(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter the address of the student " + (i + 1) + " : ");
			arr[i].setAddress(sc.next());
			System.out.print("Enter the marks of the student " + (i + 1) + " : ");
			arr[i].setMarks(sc.nextInt());
		}
		
		for(int i=0; i<arrsize; i++) {
			System.out.println((i + 1) + " name of the student " + arr[i].getName());
			System.out.println((i + 1) + " roll of the student " +arr[i].getRoll());
			System.out.println((i + 1) + " address of the student " + arr[i].getAddress());
			
			System.out.println((i + 1) + " marks of the student " + arr[i].getMarks());
			avgmarks = avgmarks + arr[i].getMarks();
		}
		System.out.println( "Average marks of all the student " + (avgmarks/arrsize));
	}

}

class Student{
	private int roll;
	private String name;
	private String address;
	private int marks;
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}