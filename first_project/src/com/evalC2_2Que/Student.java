package com.evalC2_2Que;

public class Student {
	
	private int Roll;
	private String Name;
	private String Address;
	private int Marks;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, String address, int marks) {
		super();
		this.Roll = roll;
		this.Name = name;
		this.Address = address;
		this.Marks = marks;
	}


	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + ", Address=" + Address + ", Marks=" + Marks + "]";
	}
	

	public int getRoll() {
		return Roll;
	}



	public void setRoll(int roll) {
		this.Roll = roll;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		this.Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		this.Address = address;
	}



	public int getMarks() {
		return Marks;
	}



	public void setMarks(int marks) {
		this.Marks = marks;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
