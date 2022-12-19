package com.pidkui.wrapper_class_demo;

/*
95-Program to demonstrate Boxing and Auto-boxing in Java.
-> Wrapper classes widely used when you work with collections, framework and advance frameworks.
-> For loops like for(), it is better to use int variable instead of Integer class because its
	processing is faster than Integer object because int is primitive and Integer is a class.

	for(int i = 0; i < 5; i++) {}	- work fast
	for(Integer i = 0; i < 5; i++) {} - work slow compare to variable.
*/

import java.util.ArrayList;

public class WrapperDemo2 {
	public static void main(String[] args) {
		int i = 5;
		
		Integer i1 = new Integer(i);	// boxing..
		Integer i2 = i;		// auto-boxing.. (compiler will automatically box for you)
		
		int j = i1.intValue();		// unboxing..
		int k = i1;		// auto-unboxing.. (compiler will automatically unbox for you)

		// let we want our ArrayList to work with only integers...then we have concept of Generic
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);	// we are not writing in new Integer(5), that means compiler is doing auto-boxing
		values.add(7);
//		values.add("Shubham");	// this will give an error
	}
}
