package com.pidkui.program_logic;

/*
07-Program to demonstrate binary literal in Java.
*/

public class BinaryLiteral {
    public static void main(String args[]) {
        int num = 0B101;
        System.out.println(num);

        num = 0b10_00_00_00_00;
        System.out.println(num);
    }
}
