package com.pidkui.pattern_demo;

/*
26-Program to print below pattern.
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

public class PatternDemo5 {
    public static void main(String args[]) {
        int i, j, n = 5;

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
