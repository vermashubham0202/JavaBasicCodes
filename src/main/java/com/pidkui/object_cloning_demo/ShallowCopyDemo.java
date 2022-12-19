package com.pidkui.object_cloning_demo;

/*
108-Program to demonstrate shallow copy of object in Java.
-> Copy of object is three type in java :
	- Shallow copy
	- Deep copy
	- Cloning
*/

public class ShallowCopyDemo {
	public static void main(String[] args) {
		
		// shallow copy : one object in heap but have two references
		// (not actually new object created in heap)
		BB obj1 = new BB();
		obj1.i = 5;
		obj1.j = 6;
		
		System.out.println(obj1);

		// shallow copy
		BB obj2 = obj1;
		
		// if you change the value of Obj2, it will reflect in Obj1
		obj2.i = 8;
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

class BB {
	int i, j;
	
	@Override
	public String toString() {
		return "BB{" + "i=" + i + ", j=" + j + "}";
	}
}
