package com.day5assignment.bridglabz;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit:");
		double t = sc.nextDouble();
		System.out.println("Enter wind speed in miles per hour: ");
		double v = sc.nextDouble();
		tempCalcution( t, v);
	}

	public static void tempCalcution(double t,double v) {
	 if (t < 50 && v < 120 && v > 3) {
	        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t + " Fahrenheit");
	        System.out.println("Wind speed  = " + v + " miles/hr");
	        System.out.println("Wind chill  = " + windChill + " Fahrenheit");
	    } else {
	        System.out.println("Please enter valid values.");
	    }
	}
	
}

