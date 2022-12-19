package com.pidkui.collection_generics_demo;

/*
127-Program to demonstrate collection and generics in Java.
collection - concept
Collection - interface
Collections - class
->	We have lots of interfaces and lots of classes in one big package which is Collection API.
->	Collection doesn't work with index numbers.
->	We got Collection from Java 1.2 and generics from Java 1.5
-> 	From Java 1.7 we don't require to write <Data Type> on Right Hand Side.
*/

/* 
 * Note: When you know the required size initially, then always go with array
 * not with ArrayList because array is fast compare to collection.
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenericsDemo1 {
	public static void main(String[] args) {
		// Collection is an interface and
		// ArrayList is a class which implements Collection indirectly.
		Collection values = new ArrayList();
		
		/*
		 * Size of values is not fixed, you can expand it and shrink it. 
		 * By default, type of the Collection is object type. So, we can add
		 * any type value in Collection either it is Integer, String, Character,
		 * Float, Double or any type of object.
		 */
		
		values.add(5);
		values.add(6);
		values.add(6.4f);
		values.add("Shubham");
		values.add('Y');
		values.add(4.5);
		
		// in order to fix your Collection to a specific data type value then use generics
		Collection<Integer> intValues = new ArrayList<Integer>();
		
		// From Java 1.7 onwards we can also write above statement like :
//		Collection <Integer> intValues = new ArrayList <> ();
		
		intValues.add(4);
		intValues.add(7);
//		intValues.add("Hi");	// error
//		intValues.add(5.4);		// error
		
		/* 
		 * ->	If we want to add another number in between 4 and 7, then it can not be done
		 * 		because Collection doesn't work with index numbers, so in order to work with index
		 * 		number we have to use 'List'.
		 * 
		 * ->	'List' implements Collection with extra features and one of them is, it works with index numbers.
		 * 		When we traverse or trying to print values of 'List' then we get all the values in sequence.
		 * 		(order of getting elements is fixed)
		 * 
		 * ->	To avoid duplicate values we can use 'Set' instead of 'List'.
		 * 		Again Set is an interface.
		 * 
		 * 		Set<Integer> numbers = new HashSet<>();
		 * 		'HashSet' is a class which implements 'Set'.
		 * 		Every element in 'Set' will be unique.
		 * 	
		 * 		When we traverse or trying to print values of 'Set' then we get all the values randomly.
		 * 		(order of getting elements is random)
		 * 
		 * -> 	Instead of using 'HashSet' we can use the 'TreeSet'.
		 * 		Set<Integer> numbers = new TreeSet<>();
		 * 		
		 * 		The advantage with 'TreeSet' is, it will give you elements in sorted format.
		 * 
		 * -> 	In 'List' we can have duplicate elements with unique index numbers.
		 * 		We have an interface called as 'Map'. 
		 * 		'Map' has a <key,value> pair (relationship). Which means for every 'value' we have a 'key'.
		 * 	
		 * 		Map<Integer, String> m = new HashMap<>();
		 * 		Here Integer value is key and String values are value.
		 * 		'HashMap' is a class which implements interface 'Map'.
		 * 
		 * 		'HashTable' is also a class which implements 'Map'.
		 * 		One is synchronized and other is not.
		 * 		You can go for thread safe implementation or non-thread-safe implementation depend upon your requirement.
		 */
	}
}
