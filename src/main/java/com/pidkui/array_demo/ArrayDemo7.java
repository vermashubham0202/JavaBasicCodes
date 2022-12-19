package com.pidkui.array_demo;

/*
43-Program to demonstrate 2D array.
*/

public class ArrayDemo7 {
	public static void main(String[] args) {
		int a[][] = {	
						{4, 3, 2, 1} ,
						{5, 4, 3, 2} ,
						{6, 5, 4, 3}
					};
		
		for(int i[] : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
