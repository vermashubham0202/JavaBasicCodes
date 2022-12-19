package com.pidkui.constructor_demo;

/*
51-Program to demonstrate Constructor Overloading implicit conversion.
*/

public class ConstructorDemo2 {
	public static void main(String[] args) {
		C obj1 = new C(5);	 /* It will call constructor taking double as parameter
								because constructor with int parameter is not available, so it
								will do implicit conversion from int to double. */
		
		C obj2 = new C(5.5); /* If we comment constructor taking double as parameter and make 
								constructor taking integer as parameter available. It will give us an error
								because implicit conversion from double to int is not possible. */
	}
}

class C {
	public C() {
		System.out.println("In class C default!");
	}

//	public C(int k) {
//		System.out.println("In class C int!");
//	}

	public C(double d) {
		System.out.println("In class C double!");
	}
}