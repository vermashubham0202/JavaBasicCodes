package com.pidkui.final_demo;

/*
71-Program to demonstrate 'final' keyword with variable in Java.
-> 'final' keyword can be used with variable, method or with class.
-> 'final' keyword with variable creates a constant, which you can't change.
*/

public class FinalDemo1 {
    public static void main(String[] args) {
        final int i = 5;    // if you made a variable final, you can't change its value

//        i++;		// this will give an error
//        i = 6;	// this will give an error

        System.out.println(i);

        final int j;    // if we are failed to assign value here, we can assign it later
        j = 4;
//        j = 7;		// this will give an error
        System.out.println(j);
    }
}
