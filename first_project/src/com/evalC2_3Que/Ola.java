package com.evalC2_3Que;

public class Ola {
	
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			Car Smallcar = new HatchBack();
			Smallcar.NumberOfPassenger=numberOfPassenger;
			Smallcar.NumberOfKms=numberOfKMs;
			return Smallcar;
			
		}
		else {
			Car Longcar = new Sedan();
			Longcar.NumberOfPassenger=numberOfPassenger;
			Longcar.NumberOfKms=numberOfKMs;
			return Longcar;
			
		}
	}
	
	public int calculateBill(Car car) {
		if(car.NumberOfPassenger<=3) {
			//HatchBack Smallcar = new HatchBack();
			HatchBack h1 = (HatchBack)car;
			int TotalFare=car.NumberOfKms*h1.FarePerKm;
			return TotalFare;
		}
		else {
			Sedan s1 = (Sedan)car;
			int TotalFare=car.NumberOfKms*s1.FarePerKm;
			return TotalFare;
		}
//		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
