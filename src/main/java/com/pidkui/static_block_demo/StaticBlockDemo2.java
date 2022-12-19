package com.pidkui.static_block_demo;

/*
58-Program to demonstrate actual use of static block.
*/

public class StaticBlockDemo2 {
	static String s = "";
	
	static {
		// initializing string variable
		// before executing main method
		s = "Hello World!";
	}
	
	public static void main(String[] args) {
		System.out.println("The value of s is : " + s);
	}
}
