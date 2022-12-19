package com.pidkui.constructor_demo;

/*
50-Program to demonstrate Constructor.
Constructor:
	-> Constructor is a member method.
	-> It has the same name as class name.
	-> Constructor will never return anything. (no need to mention any return type)
	-> It is used to allocate memory to the object.
	-> It can be used to initialize the value while creating object.
*/

/*
Constructor Overloading:
	-> Constructor having same name but different parameters.
*/

public class ConstructorDemo1 {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.show();
		
		B obj2 = new B(8);
		obj2.show();
		
		B obj3 = new B(7, 6.4f);
		obj3.show();
	}
}

class B {
	int i;	// default values : 0
	float f; // 0.0
	
	public B() { // default constructor
		i = 5;
		f = 5.5f;
	}
	
	public B(int k) {	// parameterized Constructor
		i = k;
	}
	
	public B(int k, float l) {	// parameterized Constructor
		i = k;
		f = l;
	}
	
	public void show() {
		System.out.println("i : " + i);
		System.out.println("f : " + f);
	}
}
