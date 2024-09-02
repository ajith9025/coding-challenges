package com.chainsys.day8;

public class Square {

	public void squareArea(double side) {
		double area = side * side;
		System.out.println("The area of the square is:" + area);
	}

	public void squareArea(double length, double breath) {
		double area = length * breath;
		System.out.println("The area of the rectangle is:" + area);
	}

	public static void main(String[] args) {
		Square square = new Square();
		square.squareArea(5);
		square.squareArea(5, 10);
	}

}












