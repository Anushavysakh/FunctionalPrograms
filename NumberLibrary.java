package com.day5assignment.bridglabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class NumberLibrary {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter number of columns: ");
			int n = sc.nextInt();

			
			int[][] a = arrayInt(m, n);
			double[][] b = arrayDouble(m, n);
			String[][] c = arrayBoolean(m, n);

			
			display(a, b, c, m, n);

		}

		public static int[][] arrayInt(int m, int n) {
			int a[][] = new int[m][n];
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Integer Array");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			return a;
		}

		public static double[][] arrayDouble(int m, int n) {
			double b[][] = new double[m][n];
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Double Array");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					b[i][j] = sc.nextDouble();
				}
			}
			return b;
		}

		public static String[][] arrayBoolean(int m, int n) {
			String c[][] = new String[m][n];
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Boolean Array");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = sc.nextLine();
				}
			}
			return c;
		}

	
		public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
			PrintWriter pw = new PrintWriter(System.out, true);

		
			System.out.println();
			pw.println(" ARRAY OF INTEGER");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print("\t" + a[i][j] + " ");
				}
				pw.println("\t");
			}

		
			System.out.println();
			pw.println("ARRAY OF DOUBLE");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print("\t" + b[i][j] + " ");
				}
				pw.println("\t");
			}

			System.out.println();
			pw.println(" ARRAY OF BOOLEAN");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print("\t" + c[i][j] + " ");
				}
				pw.println("\t");
			}
		}
}

	