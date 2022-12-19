package com.pidkui.currenttimemillis_demo;

/*
 * 146-Program to demonstrate System.currentTimeMillis() method.
 */

import java.util.ArrayList;

public class CurrentTimeMillisDemo1 {
	public static void main(String[] args) {
		// variable to store start time of the code
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> l = new ArrayList<>();
		
		for(int i = 0; i < 1000000; i++) {
			l.add(i);
		}
		
		// variable to store end time of the code
		long endTime = System.currentTimeMillis();

		// approx total time taken by program
		System.out.println(endTime - startTime);
	}
}
