package com.first_project;

public class PrimeFactor {

	public static void primeMethod(int num) {
    		
		if(num<2 || num>100) {
			System.out.println("Invalid number");
		}
		else {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}

  	}

	public static void main(String[] args){

		primeMethod(12);

	}

}
