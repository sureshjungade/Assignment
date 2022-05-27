package com.sevenday_03;

public class SuperAndthis {
	
	//What is this keyword?	
	
	/*
	 * Ans:- "This" Keyword is used to indicate the current
	 * object in a method or a constructor. it eliminates the confusion
	 * between class attributes(variables) and parameters with the same 
	 * name.
	 * 
	 * one example is shown below;
	 * 
	 * So in the below method "setNumber" you can see that
	 * there are two variables with the same name which are "number" and
	 * This keyword is referring to a class variable that is in 
	 * initialize in line no 25 and another "number" is a parameter of that 
	 * method.
	 * 
	 *  so to differentiate or to not get confused we use
	 *  this keyword.
	 * */	

	String number;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}


	// What is the meaning of Super Keyword in Java?

	/*
	 * Ans;- "super" Keyword is used to invoke overridden methods of
	 * superclass.
	 * 
	 * by using super we can access the data of parent class.
	 * we can call the parent class methods.
	 * 
	 * one example is shown below;
	 * */
	}
	class Animal{
		
		void stays() {
			System.out.println("Stay in the Forest");
		}
	}

	class Lion extends Animal{
		
		
		@Override
		void stays() {
			System.out.println("King of the Forest");
		}
		
		void LionStays() {
			stays();
			super.stays();
		}
	}


	class Main{
		public static void main(String[] args) {
			
			Lion c1 = new Lion();
			 
			c1.LionStays();
		}
}
