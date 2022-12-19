package com.pidkui.program_logic;

/*
31-Program to check whether the number is an armstrong number or not.
Eg. 153 -> 1    5   3
           (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3)
           1 + 125 + 27
           153
 */

import java.util.Scanner;

public class ArmstrongNumCheck {
    public static void main(String args[]) {
        int num, temp, rem, sum = 0;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;

        while (temp > 0) {
            rem = temp % 10;
            sum += (rem * rem * rem);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an armstrong number!");
        } else {
            System.out.println(num + " is not an armstrong number!");
        }
    }
}
