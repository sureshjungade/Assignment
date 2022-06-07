package com.masai_1st_Q;

public class InsufficientFundsException extends Exception{
	
	String errorMessage;
	
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}

}
