package com.masai_2nd_Q;

public class InvalidCountryException extends Exception{

	String errorMessage;
	
	public InvalidCountryException(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}
	
	
}
