package com.pidkui.inner_class_demo;

/*
 * 151-Program to demonstrate anonymous inner classes in java.
 * -> In this example we are creating anonymous class of interface.
*/

interface Mobile {
    void call();
}

public class InnerDemo4 {
    public static void main(String[] args) {
        Mobile m = new Mobile() {
            // we are providing implementation using anonymous class
            @Override
            public void call() {
                System.out.println("Calling mobile...");
            }
        };

        m.call();
    }
}
