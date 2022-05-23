package com.third_solution;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	public int getaccountId() {
    	return accountId;
	}
	
	public void setaccountId(int accountId) {
    	this.accountId = accountId;
    }
	
	public int getbalance() {
    	return balance;
	}
	
	public void setbalance(int balance) {
    	this.balance = balance;
    }
	
	public String getaccountType() {
    	return accountType;
	}
	
	public void setaccountType(String accountType) {
    	this.accountType = accountType;
    }
	
	public boolean withdraw(int amount) {
		if(getbalance()>=amount) {
			this.balance = balance-amount;
			System.out.println("Balance amount after withdraw: "+ balance);
			return true;
		}
		else if(amount<=0) {
			System.out.println("Amount should be positive");
		}
		System.out.println("Sorry!!! No enough balance");
		//System.out.println("Balance amount after withdraw: "+ balance);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
