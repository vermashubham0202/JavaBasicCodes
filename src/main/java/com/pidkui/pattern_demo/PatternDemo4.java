package com.pidkui.pattern_demo;

/*
25-Program to print below pattern.
    1 2 3 4
    2 3 4 1
    3 4 1 2
    4 1 2 3
*/

public class PatternDemo4 {
    public static void main(String args[]) {
        int i, j, n = 4;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(((i + j) % n) + 1 + " ");
            }
            System.out.println("");
        }
    }
}
