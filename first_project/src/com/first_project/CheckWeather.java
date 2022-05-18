package com.first_project;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing = false;
		boolean isRaining = true;
		double Temp = 60.0;
		
		if(isSnowing==true || isRaining==true || Temp<50) {
			System.out.println("Let’s stay home");
		}
		else {
			System.out.println("Let’s go out!");
		}
		
	}

}
