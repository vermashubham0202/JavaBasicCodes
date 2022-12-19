package com.pidkui.program_logic;

/*
04-Program to print ASCII values and their respective characters.
ASCII - American Standard Code for Information Interchange
ASCII Range : (0 - 127)
*/

public class AsciiValues {
    public static void main(String args[]) {

        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
}
