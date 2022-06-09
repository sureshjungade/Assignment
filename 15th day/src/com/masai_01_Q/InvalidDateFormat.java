package com.masai_01_Q;

public class InvalidDateFormat extends Exception{

String errorMessage;
	
	public InvalidDateFormat(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}
}
