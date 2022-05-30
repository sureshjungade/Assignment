package com.evalC2_4Que;

public class Person {
	
	String Name;
	String Gender;
	public Person() {
	}
	
	public Person(String name, String gender) {
		super();
		Name = name;
		Gender = gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Gender=" + Gender + "]";
	}

}
