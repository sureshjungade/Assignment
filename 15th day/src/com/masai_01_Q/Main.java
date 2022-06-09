package com.masai_01_Q;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	
	public Main() {
		super();
	}
	public static LocalDate acceptDateOfBirh(String DOB) throws InvalidDateFormat {
		
		try {
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate date = LocalDate.parse(DOB, dtf);
			System.out.println(date);
			return date;
			
		}catch(DateTimeParseException  ae) {
			throw new InvalidDateFormat("Invalid Input");
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
			String dob= sc.next();
			LocalDate Date = acceptDateOfBirh(dob);
			LocalDate cdate = LocalDate.now();
			Period diff = Period.between(cdate, Date);
			
			if(diff.isNegative()!=false) {
				int age = cdate.getYear()-Date.getYear();
				System.out.println(age+" Years Old");
			}
			else if(diff.isNegative()==false) {
				System.out.println("Date should not be in Future");
			}
			
			
			
		} catch (InvalidDateFormat e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	
}
