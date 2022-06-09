package com.masai_02_Q;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			EmployeeBonus bonus = new EmployeeBonus();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Joining date in dd-MM-yyyy fromat");
			String JoingDate = sc.next();
			int Bonus = bonus.takeInput(JoingDate);
			System.out.println("You get "+Bonus+" Bonus");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
