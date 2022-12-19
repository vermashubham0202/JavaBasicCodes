package com.pidkui.collection_generics_demo;

/*
128-Program to demonstrate collection in Java.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionGenericsDemo2 {
	public static void main(String[] args) {
		// integer type array can hold only integer values
		int values1[] = new int[4];
		
		// Object type array can hold any type of values
		Object values2[] = new Object[4];
		values2[0] = "Shubham";
		values2[1] = 2;
		values2[2] = "Yogita";
		values2[3] = 16;

		// but in both the above cases size of array is fixed, you can not expand or shrink it
		// So, we can use collection if we don't know the required size initially
		Collection values3 = new ArrayList();
		values3.add("Arpit");
		values3.add(9);
		values3.add("Anita");
		values3.add(8);
		values3.add("Narendra");
		values3.add("Devendra");
		
		/* We can fetch values from Collection using two ways:
		 * 	- iterator interface
		 * 	- enhanced for loop
		*/
		
		// fetching values using iterator
		Iterator i = values3.iterator();
		
		while(i.hasNext()) {	// hasNext() will say true if you have next element in the collection
			System.out.println(i.next());
		}
		
		System.out.println("==========");

		// iterator is old technique, so we can use enhanced for loop
		
		for(Object o : values3) {
			System.out.println(o);
		}
	}
}
