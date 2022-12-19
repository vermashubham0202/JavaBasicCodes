package com.pidkui.collection_generics_demo;

/*
133-Program to demonstrate Vector in Java.
-> Vector is a Dynamic array, which will expand its capacity by 100% if needed.
-> Vector implements List.
*/

import java.util.Random;
import java.util.Vector;

public class CollectionGenericsDemo7 {
	public static void main(String[] args) {
		Vector<Integer> values = new Vector<Integer>();
		
		Random r = new Random();
		
		for(int i = 0; i < 26; i++) {
			values.add(r.nextInt(50));
		}
		
		// it will print the capacity of vector
		System.out.println(values.capacity());

		System.out.println("============");
		
		for(int i : values) {
			System.out.println(i);
		}
		
		// enter index number whose value you want to remove
		values.remove(1);
		
		System.out.println("============");

		for(Object i : values) {
			System.out.println(i);
		}
	}
}
