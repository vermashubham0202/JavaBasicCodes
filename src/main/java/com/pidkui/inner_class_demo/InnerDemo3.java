package com.pidkui.inner_class_demo;

/*
 * 150-Program to demonstrate anonymous inner classes in java.
 */

public class InnerDemo3 {
    public static void main(String[] args) {
		/*	In case of anonymous class : 'Phone' can be a class or an interface
			InnerDemo3$1.class bytecode will be created for this anonymous class
			This numbering is done because we don't have class name for anonymous class. */

        Phone p = new Phone() {
            // anonymous inner class
            public void call() {
                System.out.println("calling...messaging...");
            }
        };

        p.call();
    }
}

class Phone {
    public void call() {
        System.out.println("calling...");
    }
}
