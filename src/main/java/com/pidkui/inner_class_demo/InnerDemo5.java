package com.pidkui.inner_class_demo;

/*
 * 152-Program to demonstrate anonymous inner classes in java.
 * -> In this example we are creating anonymous class of interface using Lambda expression.
*/

interface SmartPhone {
    void call();
}

public class InnerDemo5 {
    public static void main(String[] args) {
		/*	Here no extra class file, like : InnerDemo5$1.class not created by compiler.
			Because we are using Lambda expression, this implementation will be 
			present in SmartPhone.class file */

        SmartPhone s = () -> {
            System.out.println("SmartPhone calling...");
        };

        // if we have only one statement in function, so we also write like below :
//        SmartPhone s = () -> System.out.println("SmartPhone calling...");

        s.call();
    }
}
