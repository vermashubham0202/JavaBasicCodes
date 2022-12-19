package com.pidkui.final_demo;

/*
72-Program to demonstrate final keyword with method in Java.
-> If we make a method final then no one can override this method.
*/

public class FinalDemo2 {
    public static void main(String[] args) {
        AC obj = new AC();
        obj.show();
    }
}

class AB {
    final public void show() {
        System.out.println("In class AB");
    }
}

class AC extends AB {
    // void show() is final in AB, so we can't override it here (error)
//	public void show() {
//		System.out.println("In class AC");
//	}
}
