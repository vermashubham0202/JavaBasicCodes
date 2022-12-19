package com.pidkui.operator_demo;

/*
08-Program to demonstrate Pre & Post Increment in Java.
 */

public class PrePostInc {
    public static void main(String args[]) {
        int i = 5, j = 5;

        // Post Increment -> First assign then increase
        int k = i++;
        System.out.println(k);

        // Pre Increment -> First increase then assign
        k = ++j;
        System.out.println(k);
    }
}
