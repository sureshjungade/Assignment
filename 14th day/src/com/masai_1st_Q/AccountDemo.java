package com.masai_1st_Q;

public class AccountDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Account acc = new Account("5478");
			acc.deposit(2000);
			double Ans = acc.withdraw(2001);
			System.out.println(Ans);
		} catch (InsufficientFundsException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End of Main");
		
	}

}
