package com.pidkui.exception_handling_demo;

/*
100-Program to demonstrate Exception Handling (ArrayIndexOutOfBoundsException) in Java.
*/

public class ExceptionHandlingDemo2 {
	public static void main(String[] args) {
		int a[] = new int[4];
		
		try {
			for(int i = 0; i <= 4; i++) {
				a[i] = i * 2;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to assign more values than limit of array : " + e);
		}

		for(int value : a) {
			System.out.println(value);
		}
	}
}
