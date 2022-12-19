package com.pidkui.static_keyword_demo;

/*
54-Program to demonstrate static method and variable in Java.
-> We don't require to create object to call static method and static variable of a class.
-> static method and variables belongs to class, and we can call it by using class name.
-> We can not use non-static variable in static method.
-> static variable (class variable) / static method (class method).
*/

public class StaticDemo1 {
    public static void main(String[] args) {
        E.i = 5;
        E.show();
    }
}

class E {
    static int i;

    public static void show() {
        System.out.println("Hello " + i);
    }
}
