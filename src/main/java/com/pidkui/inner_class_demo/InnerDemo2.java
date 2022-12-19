package com.pidkui.inner_class_demo;

/*
 * 149-Program to demonstrate Nested class (static inner classes) in java.
 * -> In order to create the object of static inner class, we don't require object of outer class.
 */

public class InnerDemo2 {
    public static void main(String[] args) {
//		C.i = 6;

        C.D obj = new C.D();
        obj.j = 7;
    }
}

class C {
    static int i;

    static class D {
        int j;
    }
}
