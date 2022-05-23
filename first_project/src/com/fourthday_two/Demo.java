package com.fourthday_two;

public class Demo {
	
	public Demo(){
		System.out.println("inside Demo()");
	}
	
	public Demo(String s){
		System.out.println("inside Demo " +(s));
	}
	
	public Demo(int x){
		System.out.println("inside Demo " +(x));
	}
	
	
	public Demo(float f){
		System.out.println("inside Demo " +(f));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo object = new Demo();
		new Demo("Suresh");
		new Demo(5);
		new Demo(5);
		//new Demo(5);
		
	}

}
