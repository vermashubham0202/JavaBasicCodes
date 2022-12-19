package com.pidkui.pattern_demo;

/*
22-Program to print below pattern.
    * * * *
    * * * *
    * * * *
    * * * *
*/

public class PatternDemo1 {
    public static void main(String args[]) {
        int i, j, n = 4;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
