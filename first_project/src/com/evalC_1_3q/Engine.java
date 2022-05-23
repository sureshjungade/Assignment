package com.evalC_1_3q;

public class Engine {
	
	int rmp;
	int Power;
	String manufacturer;
	Boolean hasTurbo;
	
	public void setRmp(int rmp) {
		this.rmp=rmp;
	}
	
	public int getRmp() {
		return rmp;
	}
	
	public void setPower(int Power) {
		this.Power=Power;
	}
	
	public int getPower() {
		return Power;
	}
	
	public void setmanufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	
	public String getmanufacturer() {
		return manufacturer;
	}
	
	public void sethasTurbo(Boolean hasTurbo) {
		this.hasTurbo=hasTurbo;
	}
	
	public Boolean gethasTurbo() {
		return hasTurbo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car object = new Car();
		
	}

}
