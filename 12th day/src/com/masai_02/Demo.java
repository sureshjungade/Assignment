package com.masai_02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		//System.out.println(name);
		boolean Name = Pattern.matches("[a-zA-Z]{3,8}", name);
		boolean MobileNumber = Pattern.matches("[6789]{1}[0-9]{9}", mobileNum);
		boolean AadharNumber = Pattern.matches("[0-9]{12}", aadharCard);
		
		if(Name==true && MobileNumber==true && AadharNumber==true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String Name = sc.next();
		//Name.matches("[a-zA-Z]{3,8}");
		System.out.println("Enter Your Aadhar Card Number");
		String aadharCard = sc.next();
		//Name.matches("[0-9]{12}");
		System.out.println("Enter Your Mobile Number");
		String mobileNum = sc.next();
		//Name.matches("[6789]{1}[0-9]{9}");
		
		boolean Valid = demo.validate(Name, mobileNum, aadharCard);
		
		if(Valid==true) {
			Citizen citizen = new Citizen();
			citizen.setName(Name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			System.out.println(citizen);
		}
		else {
			System.out.println("Enter proper details");
		}
		
	}

}
