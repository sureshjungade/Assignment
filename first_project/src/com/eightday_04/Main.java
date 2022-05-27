package com.eightday_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal [] Animal = new Animal[3];
		Animal[0] = new Dog();
		
		Animal[1] = new Cat();
		
		Animal[2] = new Tiger();
		
		
		for(Animal animal: Animal) {
			animal.makeNoise();
			animal.eat();
			animal.walk();
			System.out.println("===================================");
		}
	}

}

class Animal{
	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
	
		public void eat(){
		System.out.println("Animal is eating");
		}
		
		public void walk(){
		System.out.println("Animal is walking");
		}
}

class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Barking...");
		}
}

class Cat extends Animal{
	
	@Override
	public void makeNoise(){
		System.out.println("Meaw...");
		}
	
}

class Tiger extends Animal{
	
	@Override
	public void makeNoise(){
		System.out.println("Roaring...");
		}
	
}