package com.pidkui.program_logic;

/*
14-Program to demonstrate if - else if by printing the greatest number among three
numbers.
 */

public class DemoElseIf {
    public static void main(String args[]) {
        int num1 = 4, num2 = 7, num3 = 2;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest.");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greatest.");
        } else {
            System.out.println(num3 + " is greatest.");
        }
    }
}
