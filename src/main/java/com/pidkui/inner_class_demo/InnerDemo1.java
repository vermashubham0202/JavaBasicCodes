package com.pidkui.inner_class_demo;

/*
 * 148-Program to demonstrate member inner classes in java.
 *
 * -> Class inside a class is known as inner class.
 *
 * -> We have three type of inner classes :
 * 		- Member inner class (Non-static inner class)
 * 		- Nested class (Static inner class)
 * 		- Anonymous inner class
 */

public class InnerDemo1 {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();    // to create the object of inner class 'B' we require object of class 'A'

        obj1.b = 7;
    }
}

// A$B.class file will be the byte code
class A {
    int a;

    class B {
        int b;
    }
}
