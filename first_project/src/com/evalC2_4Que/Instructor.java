package com.evalC2_4Que;

public class Instructor extends Person{
	
	int instructorId;
	int salary;
	
	public Instructor() {
	}
	
	public Instructor(String name, String gender, int instructorId, int salary) {
		super(name, gender);
		this.instructorId = instructorId;
		this.salary = salary;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}

}
