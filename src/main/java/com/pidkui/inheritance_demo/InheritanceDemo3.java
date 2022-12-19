package com.pidkui.inheritance_demo;

/*
63-Program to demonstrate object creation in inheritance in Java.
-> Whenever you create object of Sub-class you also get the object of Super-class.
or we can say whenever you call the constructor of Sub-class it also calls the default constructor
of Super-class.
*/

public class InheritanceDemo3 {
    public static void main(String[] args) {
        O obj1 = new O(5);
        N obj2 = new O();   // in Java, you can create reference of super class and object of Sub-class
    }
}

class N {
    public N() {
//		super();	// we have super method here also
					/*
					This super method will call the constructor of object class because
					every class in java extends the object class.
					*/
        System.out.println("In N const");
    }

    public N(int n) {
//        super();	// Object class constructor will be called
        System.out.println("In N const int");
    }
}

class O extends N {
    public O() {
//        super();	// there is a hidden method which call the super class' default constructor
        System.out.println("In O const");
    }

    public O(int n) {
//		super();	// this super method will be called first. It will call
                    // its super class default constructor
        System.out.println("In O const int");
    }
}
