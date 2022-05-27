package com.fourthday_4;

public class Main {

	void oddfunction(int num) {
		int A;
		if(num >= 0) {
			int reminder = num % 2;
			switch(reminder) {
				case 0:
					A = num - (num % 10) + 10;
					System.out.println(A);
					break;
				default:
					A = num;
					System.out.println(A);
			}
		}
		
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		new Main().oddfunction(98);
	}
}
