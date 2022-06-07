package com.masai_2nd_Q;

import java.util.Scanner;

public class UserRegistration {
	
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException IC = new InvalidCountryException("User Outside India cannot be registered");
			throw IC;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			UserRegistration user = new UserRegistration();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Name");
			String username = sc.next();
			
			System.out.println("Enter Your Country");
			String userCountry =sc.next();
			user.registerUser(username, userCountry);

		} catch (InvalidCountryException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of Main");
	}

}
