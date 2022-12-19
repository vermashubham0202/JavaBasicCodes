package com.pidkui.static_keyword_demo;

/*
55-Program to demonstrate static method and variable in Java.
-> We can use static variable in non-static method.
*/

public class StaticDemo2 {
    int i = 8;

    public static void main(String[] args) {
//        i++;	// this will give an error
                // because we are using non-static variable inside static method
    }
}

class F {
    static int j;

    public void show() {
        j = 6;  // static variable can be used in non-static method
                // because it will be shared by all the objects of the class
    }
}
