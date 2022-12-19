package com.pidkui.collection_generics_demo;

/*
 * 143-Program to demonstrate Map interface using LinkedHashMap.
 * -> In both HashMap and Hashtable insertion order may change, so to resolve this we can use LinkedHashMap.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionGenericsDemo17 {
	public static void main(String[] args) {
		Map<String, String> values = new LinkedHashMap<>();

		// we use put() method in Map to add values
		values.put("myName", "Shubham");
		values.put("myCrush", "Yogeeta");
		values.put("myLove", "Yami");
		
		Set<String> key = values.keySet();
		
		for(String k : key) {
			System.out.println(k + " -> " + values.get(k));
		}
	}
}
