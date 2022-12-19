package com.pidkui.collection_generics_demo;

/*
 * 138-Program to demonstrate Set interface in Java.
 * -> The class which implements Set is HashSet.
 * -> Set will have all the unique elements.
 * -> In Set values can't be repeated. (It will not give you any error, but it will not store repeated values.)
 * -> We might not get (print) all the values in the sequence in which we added them to our set (mostly) because,
 * 		we are using HashSet which will not maintain the sequence while storing values in heap memory.
 * -> To store values in ascending order use TreeSet instead of HashSet.
 */

import java.util.HashSet;
import java.util.Set;

public class CollectionGenericsDemo12 {
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();

		values.add(2);
		values.add(6);
		values.add(5);
		
		// entering 2 again
		System.out.println(values.add(2));	// add returns boolean value as true
											// if element is added successfully, otherwise false
		for(int i : values) {
			System.out.println(i);
		}
	}
}
