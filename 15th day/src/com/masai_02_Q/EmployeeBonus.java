package com.masai_02_Q;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {
	
	public EmployeeBonus() {
		super();
	}
	
	public int takeInput(String JD) throws InvalidAgeException {
		
		try {
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate curDate = LocalDate.now();
			
			LocalDate date = LocalDate.parse(JD, dtf);
			if(date.isAfter(curDate)) {
				throw new InvalidAgeException("Age should not be in the future");
			}
			Period diff = Period.between(date, curDate);
			int Exp = diff.getYears();
			if(Exp<1) {
				return 5000;
			}
			else if(Exp<2) {
				return 8000;
			}else {
				return 10000;
			}
		}catch(DateTimeParseException dt) {
			throw new InvalidAgeException("Please pass the date in the correct format");
		}
				
	}
	
	

}
