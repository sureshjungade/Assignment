package com.masai_2nd_Q;

public class Loan {
	
	public Loan() {
		super();
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		double LoanAmount = 0;
		if(employeeObj instanceof PermanentEmployee) {
			LoanAmount = employeeObj.salary*0.15;
		}else if(employeeObj instanceof TemporaryEmployee) {
			//System.out.println("hii");
			LoanAmount = employeeObj.salary*0.10;
		}else {
			return 0;
		}
		
		
		return LoanAmount;
	}

}
