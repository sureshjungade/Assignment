package com.Tenthday_03;

public class AbstractAndInterface {

}
//Interface:-

/*
 * An Interface in Java is defined as an abstract type used to specify the behaviour of a
class.The interface in Java is a mechanism to achieve 100% abstraction. There can be only
abstract methods in the Java interface, not the method body. It is used to achieve
abstraction and multiple inheritance in Java.
 Java Interface also represents the IS-A relationship
 Exampe of Interface:-*/ 
 
 
 interface A{
	 int number=10;
	 void play();
	 }
	 
 //Java compiler converts it as follows:
		 
	 interface B{
		 public static final int number=10;
		 public abstract void play();
		 }
	 
	 //abstract class
	 /*
	  * A class that is declared as abstract is known as an abstract class. It can have abstract
		and non-abstract methods. It needs to be extended and its method implemented. It
		cannot be instantiated.
		
		Important point of Abstract Class:
		An abstract class must be declared with an abstract keyword.
		It can have abstract and non-abstract methods.
		It cannot be instantiated (object creation).
		It can have constructors and static methods also.
		
		Exampe of Abstract Class:-

*/
	 
	 abstract class X{
		 
		 abstract void Method1();
		 
	 }
	 
	 class Y extends X{
		 
		 @Override
		 void  Method1() {
			 
		 }
	 }
	 
	 
	 
