package com.pidkui.array_demo;

/*
39-Program to demonstrate array.
*/

public class ArrayDemo3 {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		// assigning values to array.
		for(int i = 0; i < 5; i++) {
			a[i] = i + 1;
		}
		
		// printing values of array using enhanced for loop.
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println();
		
		// printing values of array if we don't know the length
		for(int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
