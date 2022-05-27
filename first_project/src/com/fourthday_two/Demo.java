package com.fourthday_two;

public class Demo {
	String s;
	int x;
	float f;
	
	public Demo(){
		System.out.println("inside Demo()");
	}
	
	public Demo(String s){
		
		this.s=s;
		System.out.println("inside Demo " +this.s);
	}
	
	public Demo(int x){
		
		this.x=x;
		System.out.println("inside Demo " +this.x);
	}
	
	
	public Demo(float f){
		this.f=f;
		System.out.println("inside Demo " +this.f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo object = new Demo();
//		new Demo("Suresh");
//		new Demo(5);
//		new Demo(5);
		//new Demo(5);
		System.out.println(object.s="suresh");
		System.out.println(object.x=5);
		System.out.println(object.f=11);
		
	}

}
