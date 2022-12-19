package com.pidkui.miscellaneous_topics;

/*
74-Program to demonstrate 'this' keyword in Java.
*/

import java.util.Scanner;

public class ThisDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        AF obj = new AF();
        obj.setX(sc.nextInt());

        System.out.println("You entered: " + obj.getX());
    }
}

class AF {
    private int x;	// instance variable

    public void setX(int x) {	// here x in bracket is local variable
        this.x = x;        		// here this.x is current instance
    }

    public int getX() {
        return x;
    }
}
