package com.evalC2_4Que;

public class Address {
	
	String City;
	String State;
	String PinCode;
	public Address() {
	}
	
	public Address(String city, String state, String pinCode) {
		super();
		City = city;
		State = state;
		PinCode = pinCode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", PinCode=" + PinCode + "]";
	}

}
