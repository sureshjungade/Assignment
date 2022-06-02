package com.evalC2_4Que;

public class Person {
	
	String Name;
	String Gender;
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person() {
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
		return "Person [Name=" + Name + ", Gender=" + Gender + ", address=" + address + "]";
	}

	
	

}
