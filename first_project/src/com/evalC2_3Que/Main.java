package com.evalC2_3Que;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Passenger");
		int noofPs = sc.nextInt();
		
		System.out.println("Enter Number of Kilemeters");
		int noofKm = sc.nextInt();
		Ola myOla = new Ola();
		
		Car myCar =  myOla.bookCar(noofPs, noofKm);
//		HatchBack h1 = (HatchBack) myCar;
//		
//		System.out.println(h1);
		int result = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is "+ result);
	}

}
