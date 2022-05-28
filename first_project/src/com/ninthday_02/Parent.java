package com.ninthday_02;

public abstract class Parent {

	final int number;
	public Parent(int i) {
		number = i;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public abstract void method1();
	
	public void method2() {
		System.out.println("method2 belongs to Parent class");
		}

	public void method3() {
		System.out.println("method3 belongs to Parent class");
	}

}
