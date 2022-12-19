package com.pidkui.polymorphism_demo;

/*
65-Program to demonstrate polymorphism (method-overriding) in Java.
*/

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        R obj = new R();

        obj.show();    // it will call its own overriding method show
    }
}

class Q {
    public void show() {
        System.out.println("In show Q");
    }
}

class R extends Q {
    public void show() {
        System.out.println("In overriding show R");
    }
}
