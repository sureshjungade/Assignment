package com.fourthday_three;

import java.util.Scanner;

public class Student {
	
	int roll;
	String name;
	String address;
	String collageName;
	
	public Student(int roll,String name ,String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName="NIT";
		
	}
	public Student(int roll,String name ,String address, String collage) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collage;
		
	}
	
	public int getRoll() {
    	return roll;
	}
	
	public void setRoll(int roll) {
    	this.roll = roll;
    }
	
	public String getAddress() {
    	return address;
	}
	
	public void setAddress(String address) {
    	this.address = address;
    }
	
	public String getName() {
    	return name;
	}
	
	public void setName(String name) {
    	this.name = name;
    }
	
	public String getCollageName() {
    	return collageName;
	}
	
	public void setCollageName(String collageName) {
    	this.collageName = collageName;
    }
	
	
	public static Student getStudent(boolean isFromNIT) {
//		System.out.println(isFromNIT);
		Student stud;
		if(isFromNIT) {
			stud = new Student(22, "Ramesh", "Delhi");
		}
		else {
			stud = new Student(25, "Ganesh", "Pune", "IIT");
		}
		return stud;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student object1;
		
		object1 = getStudent(true);
		
		
		System.out.println(object1.name);
		System.out.println(object1.roll);
		System.out.println(object1.address);
		System.out.println(object1.collageName);
		System.out.println("================================");
		
		Student object2;
		object2 = getStudent(false);
		System.out.println(object2.name);
		System.out.println(object2.roll);
		System.out.println(object2.address);
		System.out.println(object2.collageName);
		

	}

}
