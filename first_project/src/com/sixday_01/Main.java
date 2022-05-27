package com.sixday_01;

import java.util.Scanner;

public class Main {
	

	public static String reversString(String input){
		//write the logic
		char[] arr = input.toCharArray();
		String rev = "";
		//String [] arr = new String[input.length()];
		for(int i=arr.length-1; i>=0; i--) {
			 rev = rev + arr[i];
			 //System.out.println(input.charAt(i));
		}
		return rev;
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		sc.nextLine();
		
		String result = reversString(orignalString);
		
		//System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		
	}

}
