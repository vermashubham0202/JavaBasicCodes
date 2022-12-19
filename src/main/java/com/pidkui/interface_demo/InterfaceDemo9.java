package com.pidkui.interface_demo;

/*
86-Program to demonstrate interface with static methods in Java.
-> static methods in interface are supported from java 1.8 onwards.
*/

interface AX {
    void display();

    static void show() {
        System.out.println("In show AX");
    }
}

public class InterfaceDemo9 {
    public static void main(String[] args) {
        AX.show();	// static methods can be called without any object
    }
}
