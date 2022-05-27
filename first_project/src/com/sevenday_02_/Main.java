package com.sevenday_02_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objmain = new Student();
		
		DayScholar obj1 = new DayScholar();
		
		obj1.studId= 123;
		
		obj1.studName = "Suresh";
		obj1.examFee = 1000;
		obj1.transportFee = 500;
		double sum = obj1.payFee(obj1.examFee, obj1.transportFee);
		obj1.displayDetails();
		System.out.println("transportFee Fee "+obj1.transportFee);
		System.out.println("remaining Fee "+sum);
		System.out.println("======================================");
		Hosteller obj2 = new Hosteller(456,"Gaurav",1300,800);
		obj2.studId= 456;
		obj2.studName = "Gaurav";
		obj2.examFee = 1300;
		obj2.hostelFee = 800;
		sum = obj2.payFee(obj2.examFee, obj2.hostelFee);
		obj2.displayDetails();
		System.out.println("hostelFee "+obj2.hostelFee);
		System.out.println("remaining Fee "+sum);
		
		//objmain.displayDetails();
	}

}
class Student {
	Student(){
		
	}
	//DayScholar obj1;
	
	int studId;
	String studName;
	double examFee;
	double sum;
	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
		
	}
	
	void displayDetails(){
		System.out.println("studId "+studId);
		System.out.println("studName "+studName);
		System.out.println("examFee "+examFee);
		
		
		
	}
	
	

	double payFee(double transfee, double fee) {
		double sum = transfee-fee;
		return sum;
		
		
		
	}
	

	

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	
}

class DayScholar extends Student{
	double transportFee;
	
	

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}
	
	
}

class Hosteller extends Student{
	double hostelFee;
	
	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}

	public Hosteller(int studId, String studName, double examFee,double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}

	

	

	
}
