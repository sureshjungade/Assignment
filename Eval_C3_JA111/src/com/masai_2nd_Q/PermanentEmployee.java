package com.masai_2nd_Q;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	
	public PermanentEmployee() {
		
	}
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super();
		this.basicPay = basicPay;
//		System.out.println(basicPay);
	}

	

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		double PFamount= basicPay * 0.12;
		
		salary = basicPay - PFamount;
		//System.out.println(salary);
		
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		
	}
}
