package com.first_project;

public class DiffBwStaticNonstatic {
	int num = 5; //non-static variable
	
	static int num1 = 10; //static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num1); // we can access only static variable here can't access non-
									// static because it is a static main method
	}

}

// Difference between static and non-static variable
//The main difference between static and non-static variable is, static variable loaded in to the RAM first and Non-static varible is loaded into hard disk in form of byteode in .class file.
//we can access static variable in class but we can't access non-static variable because it's not loaded in to the Ram.
//for accessing the non-static variable we have to create object but for static variable we don't have to create object.
//we can say static variable known as global variable (for understanding only) and non-static variable known as local variable (for understanding only).
//static variable access by static and non-static method, whereas non-static variable access only inside non-static method.
//you can see the example of static and non-static variable.

