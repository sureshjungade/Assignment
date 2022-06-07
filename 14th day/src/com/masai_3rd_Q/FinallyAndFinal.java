		package com.masai_3rd_Q;
		
		public class FinallyAndFinal {
		
			//Explain Finally and Final Keyword with an Example?
					
				/*
				 * The Finally block always executed whether exception handled or not, so it contains
				 * all the necessary statements that executes irrespective of exception occurs or not.
				 * You can see the one Example Of finally below.*/
			
			
				public static void main(String args[]) {
				
					try {
				//below code do not throw any exception
				int data = 25 / 5;
				System.out.println(data);
				}
				//catch won't be executed
				
					catch (NullPointerException e) {
				System.out.println(e);
				}
				//executed regardless of exception occurred or not
				
					finally {
				System.out.println("finally block is always executed");
				}
				System.out.println("rest of the code...");
				
				
				
		//		Output:
		//		5
		//		finally block is always executed
		//		rest of the code...
				
				/*
				 * The Final keyword is a non-access modifier used for classes, attributes and methods,
				 * which makes them non-changeable (impossible to inherit or override.
				 * The final keyword is useful when you want a variable to always store 
				 * the same value, like PI (3.14159...). The final keyword is called a "modifier".
				 * You can see the one Example Of final below.*/
				 
				final String name= "Suresh";
				//Now, you can't change the name.
				
				final int value = 10;
				final int BOXWIDTH = 6;
				//value=12; it will throw the error.
				//Now, you can't change the value.
				}	
		}
