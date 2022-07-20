package com.day5assignment.bridglabz;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance obj = new Distance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = sc.nextInt();
		System.out.println("Enter the value of y:");
		int y = sc.nextInt();
		calculate(x, y);
	}

	static void calculate(int x, int y) {
		double edistance = Math.pow((x * x + y * y), 0.5);
		System.out.println("Euclidean distance between {0,0} and {x,y} is " +edistance);
	}
}