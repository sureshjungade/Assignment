package com.sevenday_01;

public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("Suresh",24,"8141334699","Surat","Backend","R&D");
		emp.display();
		emp.printSalary(100000);
		
		Manager manager = new Manager("Ramesh",28,"9824465899","Mumbai","Frontend","Design");
		manager.display();
		manager.printSalary(500000);
		
	}

}

 class Member {
	String Name;
	int Age;
	String Phonenumber;
	String Address;
	double Salary;
	
	public void printSalary(double salary){
		System.out.println("Employee Salary is : "+salary);
	}
	
	
	public Member(String name, int age, String phonenumber, String address) {
		super();
		Name = name;
		Age = age;
		Phonenumber = phonenumber;
		Address = address;
		
	}


	void display() {
		System.out.println(Name);
	}
}

 class Employee extends Member{
	 String Specialisation;
	 String Department;
	 //System.out.println();
	
	 
	 
	 @Override
	 void display() {
			System.out.println("Employee name is : "+Name);
			System.out.println("Employee Age is : "+Age);
			System.out.println("Employee Phone Number is : "+Phonenumber);
			System.out.println("Employee Address is : "+Address);
			System.out.println("Employee Specialisation is : "+Specialisation);
			System.out.println("Employee Department is : "+Department);
			
		}
	
	 public Employee(String name, int age, String phonenumber, String address,String specialisation,String department) {
		super(name, age, phonenumber, address);
		Specialisation = specialisation;
		Department = department;
		
	}

 }
 
class Manager extends Member{
	String Specialisation;
	 String Department;
	 
	public Manager(String name, int age, String phonenumber, String address,String specialisation,String department) {
		super(name, age, phonenumber, address);
		Specialisation = specialisation;
		Department = department;
	}

	@Override
	void display() {
		System.out.println("===========================");
		System.out.println("Employee name is : "+Name);
		System.out.println("Employee Age is : "+Age);
		System.out.println("Employee Phone Number is : "+Phonenumber);
		System.out.println("Employee Address is : "+Address);
		System.out.println("Employee Specialisation is : "+Specialisation);
		System.out.println("Employee Department is : "+Department);
		
	}
	
 }
