package com.pidkui.miscellaneous_topics;

/*
67-Program to demonstrate Dynamic Method Dispatch (Run Time Polymorphism) in Java.
-> The main use of method-overriding is to work with Dynamic Method Dispatch.
-> It simply says that it doesn't matter which reference you use (super class or child class), what
   matters is the instance.
*/

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        T obj1 = new T();
        U obj2 = new U();

        T obj3;
        obj3 = obj2;        // reference of super-class, object of sub-class
        obj3.show();        // it will call U's show
    }
}

class T {
    public void show() {
        System.out.println("In show T");
    }
}

class U extends T {
    public void show() {
        System.out.println("In show U");
    }
}
