package com.pidkui.swap_numbers;

/*
34-Program to swap two numbers without using a variable.
 */

public class SwapTwoNum2 {
    public static void main(String args[]) {
        int num1 = 5, num2 = 4;

        // 101		100	(3 bits)	-> Binary representation of 5 and 4
        // swapping two numbers without using a variable
        num1 = num1 + num2;        // num1 = 9 (1001)	-> it becomes 4 bit number
        num2 = num1 - num2;        // in the next logic we will save this extra bit
        num1 = num1 - num2;

        System.out.println("Num1 now contain : " + num1);
        System.out.println("Num2 now contain : " + num2);
    }
}
