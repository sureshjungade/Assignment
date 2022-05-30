package com.evalC2_4Que;

public class Main {
	
	
	public static Person generatePerson(Person person) {
		
		return person;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		Person newStudent = generatePerson(new Student("suresh","male",12,"Ft",1000));
		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		
		
	}

}
