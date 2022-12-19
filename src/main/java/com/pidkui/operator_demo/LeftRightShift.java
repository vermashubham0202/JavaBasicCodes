package com.pidkui.operator_demo;

/*
11-Program to demonstrate Bitwise Left Shift(<<) and Right Shift(>>) Operators.
 */

public class LeftRightShift {
    public static void main(String args[]) {
        int a = 25;          // 1 1 0 0 1

        int b = a << 2;  // 1 1 0 0 1 0 0  (Left Shift by 2 bits)
        System.out.println(b);

        int c = a >> 2;     //      1 1 0  (Right Shift by 2 bits)
        System.out.println(c);
    }
}
