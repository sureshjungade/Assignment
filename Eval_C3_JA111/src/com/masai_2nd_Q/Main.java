package com.masai_2nd_Q;

public class Main {

	public static void main(String[] args) {
		
		Loan loanobj = new Loan();
		
		PermanentEmployee PEmploye = new PermanentEmployee(123,"Suresh",100);
		PEmploye.calculateSalary();
		TemporaryEmployee TEmploye = new TemporaryEmployee(456,"Gaurav",100,100);
		
		TEmploye.calculateSalary();
		
		double result = loanobj.calculateLoanAmount(PEmploye);
		double result1 = loanobj.calculateLoanAmount(TEmploye);
		double result2 = loanobj.calculateLoanAmount(null);
		
		System.out.println("Result : "+result);
		
		System.out.println("Result1 : "+result1);
		
		System.out.println("Result2 : "+result2);
	}

}
