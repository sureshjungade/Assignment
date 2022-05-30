package com.ninthday_02;

import java.util.Scanner;

public final class Child extends Parent{
	
	@Override
	public void method1() {
		
			System.out.println(number);
			System.out.println("method1 belongs to Child class");
		
		}
	
	public void method4() {
		System.out.println("method4 belongs to Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number from 1 to 10");
		int input = sc.nextInt();
		if(input>=1 && input<=10) {
			Parent parent = new Child(input);
			
			parent.method1();
			parent.method2();
			parent.method3();
			
			Child child = (Child)parent;
			child.method4();
		}
		else {
			System.out.println("Invalid number");
		}
		
	}
	
		public Child(int i) {
			super(i);	
			}
}

