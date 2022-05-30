package com.evalC2_3Que;

public class Car {
	int NumberOfPassenger;
	int NumberOfKms;
	
	public Car() {
		
	}
	
	public int getNumberOfPassenger() {
		return NumberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		NumberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return NumberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		NumberOfKms = numberOfKms;
	}

	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		NumberOfPassenger = numberOfPassenger;
		NumberOfKms = numberOfKms;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	

}
