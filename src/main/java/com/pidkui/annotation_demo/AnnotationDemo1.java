package com.pidkui.annotation_demo;

import java.util.ArrayList;

/*
 * 158-Program to demonstrate some in-built Annotation in java.
 * -> We can use annotation on class, methods, interface and variables.
 */

public class AnnotationDemo1 {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.oldShow();
	}
}

@FunctionalInterface	// it is used when interface has only one method
interface Abc {
	void show();
//	void newshow(); 	// by mistake if you put another method, it will give you error at compile time
}

class A {
	public void show() {
		System.out.println("In show A");
	}
}

class B extends A {
	@Override	// it will give you error at compile time if you write wrong name
				// of override method by mistake
	// as well as it will help other coders to understand what are you doing here

	@SuppressWarnings("unchecked")		// to suppress warnings
	public void show() {
		ArrayList obj = new ArrayList();
		System.out.println("In show B");
	}
	
	@Deprecated		// use to indicate that this method is deprecated
	public void oldShow() {
		System.out.println("This method is available for you, but don't use it.");
	}
}
