package com.pidkui.array_demo;

/*
42-Program to demonstrate 2D array.
*/

public class ArrayDemo6 {
	public static void main(String[] args) {
		int a[][] = new int[3][4];
		
		a[0][0] = 5; a[0][1] = 6; a[0][2] = 7; a[0][3] = 8;
		a[1][0] = 6; a[1][1] = 7; a[1][2] = 8; a[1][3] = 9;
		a[2][0] = 9; a[2][1] = 8; a[2][2] = 7; a[2][3] = 6;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j< 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
