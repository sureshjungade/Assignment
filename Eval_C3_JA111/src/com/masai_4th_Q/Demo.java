package com.masai_4th_Q;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valid User Name");
		String username = sc.next();
		boolean Validusername = Pattern.matches("[a-zA-Z]{3,8}", username);
		
		System.out.println("Enter valid Password");
		String password = sc.next();
		boolean Validpassword = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		
		System.out.println("Enter valid Mobile Number");
		String mobileNumber = sc.next();
		boolean ValidmobileNumber = Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber);
		
		System.out.println("Enter valid Email id");
		String email = sc.next();
		boolean Validemail = Pattern.matches("^(.+)@(.+)$", email);
		
		if(Validusername==true && Validpassword==true && ValidmobileNumber==true && Validemail==true) {
			Customer customer = new Customer();
			
			customer.setUsername(username);
			customer.setPassword(password);
			customer.setMobileNumber(mobileNumber);
			customer.setEmail(email);
			System.out.println(customer);
		}
		else {
			System.out.println("Please Enter Valid Inputs same as metioned");
		}
	}

}
