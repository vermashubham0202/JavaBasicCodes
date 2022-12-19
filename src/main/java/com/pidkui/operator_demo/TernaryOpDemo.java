package com.pidkui.operator_demo;

/*
15-Program to demonstrate Ternary operator in Java.
 */

public class TernaryOpDemo {
    public static void main(String args[]) {
        int i = 2, j;
        j = (i == 1) ? 6 : 7;   /*
                                    if(i == 1)
                                        j = 6;
                                    else
                                        j = 7;
                                */
        System.out.println(j);
    }
}
