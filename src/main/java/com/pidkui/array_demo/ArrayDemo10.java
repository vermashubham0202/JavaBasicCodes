package com.pidkui.array_demo;

/*
46-Program to demonstrate 3D array.
*/

import java.util.Random;

public class ArrayDemo10 {
	public static void main(String[] args) {
		int a[][][] = new int[4][4][4];		// this array can contain 4 * 4 * 4 = 64 values
		
		Random r = new Random();
		
		// assigning random values to array
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					a[i][j][k] = r.nextInt(10);
				}
			}
		}
		
		// printing values of 3D array
		for(int[][] i : a) {
			for(int[] j : i) {
				for(int k : j) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
