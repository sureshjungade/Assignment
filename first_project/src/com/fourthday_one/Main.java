package com.fourthday_one;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student object1 = new Student();
		object1.setRoll(10);
		object1.setName("Gaurav");
		object1.setAge(26);
		object1.setMarks(398);
		System.out.println("object1");
		object1.showDetails();
		
		System.out.println("===================object2==================");
		Student object2 = new Student(22,"Suresh",24,400);
		System.out.println("Roll is :"+object2.getRoll());
		System.out.println("Name is :"+object2.getName());
		System.out.println("Age is :"+object2.getAge());
		System.out.println("Marks is :"+object2.getMarks());
		
	}

}
