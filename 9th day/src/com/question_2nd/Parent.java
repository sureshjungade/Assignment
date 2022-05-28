package com.question_2nd;

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
		System.out.println("this method belongs to Parent class");
		}

	public void method3() {
		System.out.println("this method belongs to Parent class");
	}
	
	

}

class Child extends Parent{
	
	
	
	@Override
	public void method1() {
			System.out.println(number);
			System.out.println("this method belongs to Child class");
		}
	
	public void method4() {
		System.out.println("this method belongs to Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(2);
		
		parent.method1();
		parent.method2();
		parent.method3();
		
		Child child = (Child)parent;
		child.method4();
	}
	
		public Child(int i) {
			super(i);	
			}
}
