package com.masai_02;

public class Citizen {
	
	private String Name;
	private String AadharNumber;
	private String MobileNumber;
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAadharNumber() {
		return AadharNumber;
	}



	public void setAadharNumber(String aadharNumber) {
		AadharNumber = aadharNumber;
	}



	public String getMobileNumber() {
		return MobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}



	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", AadharNumber=" + AadharNumber + ", MobileNumber=" + MobileNumber + "]";
	}



	

}
