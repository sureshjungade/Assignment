package com.fifthday_3;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails() {
		
		Account obj = new Account();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Account Id");
		obj.setaccountId(scanner.nextInt());
		
		System.out.println("Enter Account Type");
		obj.setaccountType(scanner.next());
		
//		scanner.nextLine();
		while(true) {
			System.out.println("Enter balance");
			int x = scanner.nextInt();
			if(x > 0) {
				obj.setbalance(x);
				return obj;
			}
			System.out.println("Balance should be positive");
		}
		
		
		
	}
	
	
	public int getWithdrawAmount() {
		//Account obj = new Account();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
				System.out.println("Enter amount to be withdrawn");
			int y = scanner.nextInt();
			if(y > 0) {
				return y;
			}
			System.out.println("Amount should be positive");
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails obj1 = new AccountDetails();
		Account obj = obj1.getAccountDetails();
		
//		obj1.getAccountDetails();
		
		int x = obj1.getWithdrawAmount();
		obj.withdraw(x);
//		System.out.println(obj.getbalance());
		
	}

}
