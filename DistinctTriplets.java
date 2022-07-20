package com.day5assignment.bridglabz;

import java.util.Scanner;

public class DistinctTriplets {
	public static int findTriplets(int arr[], int length) {
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				for (int k = j + 1; k < length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter array elements:");
			array[i] = sc.nextInt();
		}
		int sum=findTriplets(array,size);
		System.out.println("Sum of Triplets="+sum);
	}

}
