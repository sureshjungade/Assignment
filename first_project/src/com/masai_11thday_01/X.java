package com.masai_11thday_01;

public interface X {
	
	
	abstract void Method1();
	
	default void Method2() {
		System.out.println("Indide Method2 X");
	}
	
	public static void Method3() {
		System.out.println("Indide Method3 X");
		}

	

}
