package com.pidkui.collection_generics_demo;

/*
 * 141-Program to demonstrate Map interface using Hashtable class,
 * -> Difference between HashMap (Java 1.2) and Hashtable (Since Java introduced):
 * 		- Hashtable is synchronized (Thread safe). (Slow) (Works with single thread)
 * 		- HashMap is not synchronized (not Thread safe). (Fast)	(Works with multiple threads)
 * 		- Hashtable does not allow null key
 * 		- HashMap allows one null key
 * 
 * -> Hashtable is less used by programmers.
*/

import java.util.Hashtable;
import java.util.Map;

public class CollectionGenericsDemo15 {
	public static void main(String[] args) {
		Map<String,String> values = new Hashtable();

		// we use put() method in Map to add values
		values.put("myName", "Shubham");
		values.put("favActor", "Aamir Khan");
		values.put("favSinger", "Atif Aslam");
		
		System.out.println(values);
	}
}
