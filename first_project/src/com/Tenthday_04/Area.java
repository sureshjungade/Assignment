package com.Tenthday_04;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int Area = length*breadth;
		System.out.println("Area of the Reactange : "+Area);
		return 0;
	}

	@Override
	public int squareArea(int side) {
		int Area = side*side;
		System.out.println("Area of the Square : "+Area);
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		double Area = 3.14*radius*radius;
		System.out.println("Area of the Circle : "+Area);
		return 0;
	}

}
