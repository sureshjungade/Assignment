package com.masai_11thday_01;

public interface Y {

	
	abstract void Method4();
	
	default void Method5() {
		System.out.println("Indide default Method5 Y");
	}
	
	public static void Method6() {
		System.out.println("Indide Method6 Y");
		}
}
