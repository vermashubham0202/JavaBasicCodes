package com.pidkui.swap_numbers;

/*
33-Program to swap two numbers using a variable.
*/

public class SwapTwoNum1 {
    public static void main(String args[]) {
        int num1 = 4, num2 = 7, temp;

        // swapping two numbers using a variable
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Num1 now contain : " + num1);
        System.out.println("Num2 now contain : " + num2);
    }
}
