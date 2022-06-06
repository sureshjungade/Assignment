package com.masai_1st_Q;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of elements in the array");
			int inputsize = sc.nextInt();
			
			int[] arr = new int[inputsize];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter the elements in the array");
				int arrelement = sc.nextInt();
				arr[i] = arrelement;
			}
			System.out.println("Enter the index of the array element you want to access");
			int arrindex = sc.nextInt();
			System.out.println(arr[arrindex]);
		}catch(ArrayIndexOutOfBoundsException beyondsize) {
			System.out.println("Array limit Excceded");
		}catch(NumberFormatException Str) {
			System.out.println("Please enterNumber");
		}catch(InputMismatchException inputmismatch) {
			System.out.println("Please enter Number");
		}
		System.out.println("End of Main");
	}

}
