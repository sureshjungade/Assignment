package com.Tenthday_01;

import java.util.Scanner;

public class Demo {

	
	public Hotel provideFood(int amount) {
		
		Hotel hoteltype;
		if(amount>1000) {
			hoteltype = new TajHotel();
			return hoteltype;
		}
		else if(amount>200 && amount<=1000) {
			hoteltype = new RoadSideHotel();
			return hoteltype;
			
		}else {
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid amount");
		int input = sc.nextInt();
		
		Demo demo = new Demo();
		
		Hotel h1 = demo.provideFood(input);
		if(h1 instanceof TajHotel) {
			h1.chickenBiryani();
			h1.masalaDosa();
			((TajHotel) h1).welcomeDrink();
		}
		else if(h1 instanceof RoadSideHotel){
			h1.chickenBiryani();
			h1.masalaDosa();
			
			
		}
		else {
			System.out.println("Please Enter Valid amount");
		}
		
		
		
		
	}

}
