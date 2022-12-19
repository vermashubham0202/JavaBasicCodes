package com.pidkui.array_demo;

/*
45-Program to demonstrate jagged array.
*/

public class ArrayDemo9 {
	public static void main(String[] args) {
		int a[][] = new int[3][];
		// mentioning size of each row
		a[0] = new int[4];
		a[1] = new int[2];
		a[2] = new int[3];
		
		a[0][0] = 5; a[0][1] = 6; a[0][2] = 7; a[0][3] = 8;
		a[1][0] = 6; a[1][1] = 7;
		a[2][0] = 9; a[2][1] = 8; a[2][2] = 7;
		
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
