package com.pidkui.collection_generics_demo;

/*
134-Program to demonstrate difference between Vector and ArrayList in Java.
-> Both Vector and ArrayList implements List.
-> We will see when to use Vector and when to use ArrayList.

-> When we use Vector, it will increase the capacity by 100% if exceeded,
	but when we use ArrayList it will increase its capacity by 50% if exceeded.
	Simply we can say, Vector waste lots of memory and ArrayList saves lots of memory.

-> Every method in Vector are synchronized (thread safe <theoretically>), whereas in ArrayList
	methods are not thread safe.
	
-> Since Vector are thread safe so, they are slow, and ArrayList are not thread safe so, they are fast.
-> conclusion : ArrayList are much superior then Vector.
*/

import java.util.ArrayList;
import java.util.Vector;

public class CollectionGenericsDemo8 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Vector<Integer> v = new Vector();
	}
}
