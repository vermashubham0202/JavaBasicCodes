package com.pidkui.enum_demo;

/*
 * 154-Program to demonstrate enum in java.
*/

enum Mobile {	// here Mobile is enum's name
	// constants
	APPLE, SAMSUNG, HTC;	// semicolon at the end is not compulsory in enum
}

public class EnumDemo2 {
	public static void main(String[] args) {
		System.out.println(Mobile.APPLE);
	}
}
