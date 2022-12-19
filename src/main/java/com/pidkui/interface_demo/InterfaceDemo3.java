package com.pidkui.interface_demo;

/*
80-Program to demonstrate instantiating interface object without other class in Java.
*/

interface AM {
    void show();
}

/* There are two ways to create an object : (These are not official terms)
 	-> Invention
 	-> Discovery (first creating the objects then provide the implementation) */

public class InterfaceDemo3 {
    public static void main(String[] args) {
        AM obj = new AM() {
            // imagine this block here as a class
            // when we provide implementation it becomes a class
            // this class has no name, so it is called anonymous class
            public void show() {
                System.out.println("In show");
            }
        };

        obj.show();
    }
}
