package com.masai_2nd_Q;

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	
	
	public TemporaryEmployee() {
		
	}
	
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void calculateSalary() {
		
		salary = hoursWorked * hourlyWages;
		
		
	}

}
