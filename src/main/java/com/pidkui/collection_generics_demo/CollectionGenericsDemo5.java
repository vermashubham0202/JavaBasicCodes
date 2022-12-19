package com.pidkui.collection_generics_demo;

/*
131-Program to demonstrate List in Java.
-> List extends Collection with more features.
-> In List we also have index number with ArrayList.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionGenericsDemo5 {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList();

		values.add(13);
		values.add(11);
		values.add(3);
		values.add(4);
		values.add(8);
		values.add(9);
		
		// adding '6' between '4' and '8'
		values.add(4, 6);
		
		for(int i : values) {
			System.out.println(i);
		}
		
		System.out.println("==============");
		
		// sorting the values of list using Collections class's sort() method
		Collections.sort(values);
		
//		for(int i : values) {
//			System.out.println(i);
//		}
		
		// in List, we can print element in one more way:
		values.forEach(System.out::println);	// Stream API .. Lambda expression
	}
}
