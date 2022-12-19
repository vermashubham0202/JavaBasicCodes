package com.pidkui.collection_generics_demo;

/*
 * 139-Program to demonstrate Set interface using TreeSet class in Java.
 * -> TreeSet class also implements Set interface.
 * -> In TreeSet values are stored in Ascending order. (So while fetching values you also get values in
 * 	ascending order.)
 */

import java.util.Set;
import java.util.TreeSet;

public class CollectionGenericsDemo13 {
	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<>();

		values.add(2);
		values.add(9);
		values.add(5);
		values.add(17);
		values.add(7);
		
		for(int i : values) {
			System.out.println(i);
		}
	}
}
