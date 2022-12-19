package com.pidkui.swap_numbers;

/*
35-Program to swap two numbers using XOR (^) operator.
	It will not take any extra bit.
 */

public class SwapTwoNum3 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 4;

        num1 = num1 ^ num2;		// (1 0 1) ^ (1 0 0) -> (0 0 1) = 1
        num2 = num1 ^ num2;		// (0 0 1) ^ (1 0 0) -> (1 0 1) = 5
        num1 = num1 ^ num2;		// (0 0 1) ^ (1 0 1) -> (1 0 0) = 4

        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
    }
}
