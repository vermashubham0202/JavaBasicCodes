package com.pidkui.object_cloning_demo;

/*
110-Program to demonstrate object cloning in Java.
-> Object cloning is combination of Shallow Copy and Deep Copy.
-> By default in Java object instances are not allowed to be cloned because of security reasons.
-> To give permission to clone an object of a class you should 'implements Cloneable' interface, it
	is a marker interface (it has no method).
-> Marker interface are usually used for permissions.
*/

public class ObjectCloningDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		BD obj1 = new BD();

		obj1.i = 5;
		obj1.j = 6;
		
		System.out.println(obj1);
		
		// object cloning : new object will be created and all the values will be copied automatically.
		BD obj2 = (BD) obj1.clone();
		
		System.out.println(obj2);
		
		// changing i value of obj2
		obj2.i = 9;
		
		System.out.println(obj2);
		System.out.println(obj1);
	}
}

class BD implements Cloneable {
	int i, j;
	
	@Override
	public String toString() {
		return "BD{" + "i=" + i + ", j=" + j + "}";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
