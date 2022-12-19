package com.pidkui.collection_generics_demo;

/*
 * 145-Program to print only duplicate elements in ArrayList.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionGenericsDemo19 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		names.add("Shubham");
		names.add("Akki");
		names.add("Arpit");
		names.add("Akki");
		
		// to print unique values create a set
		Set<String> sname = new HashSet<>();
		
		for(String s : names) {
			if(!sname.add(s)) {    // if sname.add() return false then only print value
				System.out.println(s);
			}
		}
	}
}
