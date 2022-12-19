package com.pidkui.program_logic;

/*
49-Program to create a class and object of that class.
*/

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        A obj = new A();

        obj.show();

        // destroying object
        obj = null;     // now obj is ready for garbage collection
    }
}

class A {
    int x;

    public void show() {
        System.out.println("Hello from class!");
    }
}
