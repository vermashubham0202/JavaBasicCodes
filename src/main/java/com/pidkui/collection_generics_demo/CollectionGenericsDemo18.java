package com.pidkui.collection_generics_demo;

/*
 * 144-Program to demonstrate Map interface using TreeMap.
 * -> If you want to store values in sorted format of 'keys' then use TreeMap.
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionGenericsDemo18 {
	public static void main(String[] args) {
		Map<String, String> values = new TreeMap<>();

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
