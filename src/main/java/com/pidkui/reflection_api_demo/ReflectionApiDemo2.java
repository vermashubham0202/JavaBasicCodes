package com.pidkui.reflection_api_demo;

/*
119-Program to demonstrate Reflection API in Java.
-> In this example we will check that whether .class file contain a class or an interface.
-> class 'Class' is used for debugging and to know more about your class.
*/

public class ReflectionApiDemo2 {
    public static void main(String[] args) throws Exception {

        Class c = Class.forName("com.pidkui.reflection_api_demo.A"); // here we mentioned the full path
        // if 'A' is an interface it will return true
        // otherwise if it is a class it will return false
        System.out.println(c.isInterface());
        System.out.println(c.getSuperclass());
    }
}

class A {    // by default every class in Java extends Object class
}