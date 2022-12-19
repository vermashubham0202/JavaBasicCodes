package com.pidkui.collection_generics_demo;

/*
129-Program to demonstrate collection & generic in Java.
-> In the below program we are creating a collection which can store only integer values.
-> We can create our custom classes (for eg. Student) and we can use them as generic.
-> In collection we can not add the element in between two numbers because there is no index numbers.
*/

/* Note: Collection only works with classes, not with primitive data types.
* That's why we are passing Integer class as generic in below code; not 'int'
*/

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenericsDemo3 {
	public static void main(String[] args) {
		// use Integer as generic
		Collection<Integer> values = new ArrayList<Integer>();
//		values.add("Shubham");	// error
		values.add(5);
		values.add(7);
		values.add(2);
		values.add(9);

		// to remove any value we can write
		values.remove(2);
		
		// we can not sort Collection elements using Collections class's sort() method
		// because it doesn't have index numbers
//		 Collections.sort(values);	// error
		for(int e : values) {	// now we can write either Integer/int (Wrapper classes or primitive type);
								// Object as type of e.
			System.out.println(e);
		}
	}
}
