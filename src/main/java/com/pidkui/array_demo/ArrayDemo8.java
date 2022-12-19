package com.pidkui.array_demo;

/*
44-Program to demonstrate jagged array.
*/

public class ArrayDemo8 {
	public static void main(String[] args) {
		int a[][] = {	
				{4, 3, 2, 1} ,
				{5, 4} ,
				{6, 5, 4}
			};

		for(int i[] : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
