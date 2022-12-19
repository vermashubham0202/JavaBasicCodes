package com.pidkui.collection_generics_demo;

/*
135-Program to demonstrate difference between LinkedList and ArrayList in Java.
-> Both LinkedList and ArrayList are the implementation of List interface.
-> ArrayList is implemented with the concept of Dynamic Array.
	- If we want to add any element between two numbers at any index number, then all the numbers
		below that number will get shifted, and it will take time to shift (Time consuming).
	- Even if we remove any element from middle, it will take time to shift below numbers of that
		numbers upward.
-> LinkedList is implemented with the concept of Double Linked List.
	- In LinkedList if we add any number in between, then we have to only change the (Next, Previous)
		of the corresponding nodes.
	- Same thing also happen when we have to delete any node in between.
		So, it is Time saving.

-> So, when it comes to insertion and deletion, LinkedList wins over ArrayList.

-> When we have to fetch data from a particular location, then LinkedList take more time than
	ArrayList. ArrayList has index numbers, so ArrayList wins there.
*/

public class CollectionGenericsDemo9 {
	public static void main(String[] args) {
	}
}
