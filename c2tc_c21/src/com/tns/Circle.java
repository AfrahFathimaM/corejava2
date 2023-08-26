package com.tns;
import java.util.Scanner;
public class Circle {
	double radius,pi=3.14;
	String color;

	Scanner sc=new Scanner(System.in);

	private void getInput() {
	System.out.println("enter the radius of the circle");
	radius=sc.nextDouble();
	System.out.println("enter the color of the circle");
	color=sc.next();
	}
	
		// TODO Auto-generated method stub


	
	private void calcarea() {
		// TODO Auto-generated method stub
		double area=pi*radius*radius;
		System.out.println("the area of the "+color+" colored circle is"+area);}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.getInput();
		c.calcarea();
	}

}
