package com.pidkui.interface_demo;

/*
85-Program to demonstrate problem related to interface in Java.
-> If you have any method inside your interface which overrides Object class methods
	then this will give you an error.
*/

interface AW {
	// this method is already present in Object class (in java.lang.Object) (below code will give error)
//	default boolean equals(Object o) {
//		return true;
//	}
}

public class InterfaceDemo8 {
	public static void main(String[] args) {
	}
}
