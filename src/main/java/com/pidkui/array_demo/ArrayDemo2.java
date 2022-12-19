package com.pidkui.array_demo;

/*
38-Program to demonstrate array elements printing with Enhanced for loop.
Enhanced for loop is used when we want to fetch all values from 
beginning to end; it only works with arrays and collections.
*/

public class ArrayDemo2 {
	public static void main(String[] args) {
		int a[] = {5, 7, 9, 4, 6, 8};
		
		for(int e : a) {
			System.out.println(e);	// here 'e' is the value in enhanced for loop
		}
	}
}
