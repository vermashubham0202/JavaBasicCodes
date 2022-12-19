package com.pidkui.enum_demo;

/*
 * 155-Program to demonstrate java's enum differences.
 * -> In Java we can define enum inside the class. (In C and C++, it is not possible)
 * 	But, not inside the method.
*/

public class EnumDemo3 {
	enum Watch {
		ROLAX, FASTTRACK, SONATA;
	}
	
	public static void main(String[] args) {
			System.out.println(Watch.ROLAX);
	}
}
