package com.eightday_03;

//Explain dynamic polymorphism ?

public class DynamicPolymorphism {
	
	// It is a process in which call to overridden method at runtime rather than compile-time.
	// in this process we call the overridden method of child object where we parent class reference to 
	//child class object like given below example we can understand/
		// 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal A = new Animal();
		Animal A = new Dog(); //here parent class reference to the child class object
		//A = new Cat();
		A.funA(); // if we call funA() method for parent class refence we get the overriden method
		//of Dog class, because it is reference to the child(Dog) class object, it's known as a
		// dynamic polymorphism.
	}

}

class Animal{
	
	void funA(){
		System.out.println("Inside Animal");
	}
}

class Dog extends Animal{
	@Override
	void funA(){
		System.out.println("Inside Dog");
	}
}

class Cat extends Animal{
	
	
	@Override
	void funA(){
		System.out.println("Inside Cat");
	}
}
