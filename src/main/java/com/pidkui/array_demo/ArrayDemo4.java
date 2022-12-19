package com.pidkui.array_demo;

/*
40-Program to assign random numbers to array.
*/

import java.util.Random;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int a[] = new int[20];
		
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50); 	// it will give random values between 0 to 50 (50 excluded)
		}
		
		for(int e : a) {
			System.out.println(e);
		}
	}
}
