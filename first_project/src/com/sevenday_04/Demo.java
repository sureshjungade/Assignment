package com.sevenday_04;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		//System.out.println(bank);
		//Bank Bank = new Bank();
		if(bank.equals("axis")) {
			//System.out.println("axis");
			AxisBank AxisBankObj = new AxisBank();
			AxisBankObj.rateOfInterest=5;
			return AxisBankObj;
		}
		if(bank.equals("icici")) {
			//System.out.println("icici");
			//System.out.println(bank);
			ICICIBank ICICIBankObj = new ICICIBank();
			
					return ICICIBankObj;
					
			}
		else {
			
			return null;
		}
		//return Bank;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank AxisBankObj = new AxisBank();
		Demo demoObj = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Bank Name like axis or icici");
		String input = sc.next();
		sc.nextLine();
		Bank GetBankName = demoObj.getBank(input);
		//System.out.println(GetBankName);
		//GetBankName.displayDetails();
		//System.out.println(GetBankName.branchName);
		if(input.equals("axis")) {
			GetBankName.displayDetails();
			AxisBankObj.getCreditCard();
		}else if(input.equals("icici")) {
			
			GetBankName.displayDetails();
		}
		else {
			System.out.println(GetBankName);
		}
	}

}

class Bank{
	String branchName;
	String IfscCode;
	
	void displayDetails(){
		//The above method will display the details of the bank(branchName,
		//ifscCode)
		this.branchName="Bhatar Branch";
		this.IfscCode="010895";
		System.out.println("Branch Name : "+branchName);
		System.out.println("IFSC Code : "+IfscCode);
	}
}

class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails(){
		//details(branchName, ifscCode, rateOfInterest )
		this.branchName="Axis Bhatar Branch";
		this.IfscCode="010895";
		this.rateOfInterest = 7;
		System.out.println("Branch Name : "+branchName);
		System.out.println("IFSC Code : "+IfscCode);
		System.out.println("Rate of Interest : "+rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	
	double rateOfInterest;

	@Override
	void displayDetails(){
		//details(branchName, ifscCode, rateOfInterest )
		
		this.branchName="Vesu ICICI Branch";
		this.IfscCode="057895";
		this.rateOfInterest = 9;
		System.out.println("Branch Name : "+branchName);
		System.out.println("IFSC Code : "+IfscCode);
		System.out.println("Rate of Interest : "+rateOfInterest);
	}
}


