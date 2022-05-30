package com.eightday_02;
//Question: Explain ClassCastException with the help of the example.


public class ClassCastException{
    public static void main(String[] args){
    	Vehicle a1 = new Vehicle();
    	Vehicle a2 = new Bike();
    	Vehicle a3 = new Scooter();
        
        // here we can pass Vehicle, Bike, Scooter object to the variable with Vehicle reference since Vehicle is the same
        //class while Bike & Scooter are the subclasses of the Vehicle
        
        
        //Bike b1 = new Scooter();
        // Even though both Bike & Scooter are child classes of Vehicle, we cannot pass Scooter object to the 
        //variable with Bike reference since it is neither the same class nor the subclass of Scooter.
        //Hence on running the code it will throw a ClassCastException.
    }
}

	class Vehicle{
	}
	
	class Bike extends Vehicle{
	}
	
	class Scooter extends Vehicle{
	}
	
	//from above example we can say that,
	//We can downcast the parent class variable to the child class object only if
	//the Parent class variable points to the Child class object , otherwise it will throw a
	//runtime exception called ClassCastException.
