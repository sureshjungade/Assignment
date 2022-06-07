package com.masai_1st_Q;

public class Account {
	
	String accountNumber;
	double Balance;
	
	
	public Account() {
		
	}
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	void deposit(double amount){
		this.Balance = amount;
	}
	
	double withdraw(double amount) throws InsufficientFundsException{
		
		if(amount>this.Balance) {
			InsufficientFundsException IF = new InsufficientFundsException("Insufficient Fund");
			throw IF;
		}
		else {
			double ReaminingAmount = this.Balance-amount;
			return ReaminingAmount;
		}
		
	}
	

}
