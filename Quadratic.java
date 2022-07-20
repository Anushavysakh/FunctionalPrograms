package com.day5assignment.bridglabz;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadratic obj = new Quadratic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c:");
		double c = sc.nextDouble();
		calculation(a,b,c);
	}
	static void calculation(double a,double b, double c) {
	double delta= b * b - 4.0 * a * c;  

		double x1 = (-b + Math.pow(delta,0.5)) / (2 * a);
		double x2 = (-b - Math.pow(delta,0.5)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}

}
