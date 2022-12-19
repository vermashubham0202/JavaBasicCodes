package com.pidkui.array_demo;

/*
41-Program to demonstrate different types of errors in array.
*/

import java.util.Random;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int a[] = new int[20];
		
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50); 	// it will give random values between 0 and 50 (50 excluded)
		}
		
		for(int e : a) {
			System.out.println(e);
		}
		
		try {
			System.out.println(a[21]);	// error : Index 21 out of bounds for length 20 (Unchecked Exception)
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum index is 19 : " + e);
		}
	}
}
