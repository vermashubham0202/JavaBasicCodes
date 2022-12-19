package com.pidkui.polymorphism_demo;

/*
64-Program to demonstrate polymorphism (method-overloading) in Java.
Polymorphism : 
	-> Method Over-loading (Early Binding or Static Binding or Compile Time Polymorphism)
	-> Method Over-riding (Late Binding or Dynamic Binding or Runtime Polymorphism)
	-> Constructor Overloading
*/

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        P obj = new P();

        obj.show();            // show without parameter will be called
        obj.show(5);        // show with parameter int will be called
        obj.show(4.2f);    // show with parameter float will be called
    }
}

class P {
    public void show() {
        System.out.println("In show");
    }

    public void show(int i) {
        System.out.println("In show int " + i);
    }

    public void show(float j) {
        System.out.println("In show int " + j);
    }
}