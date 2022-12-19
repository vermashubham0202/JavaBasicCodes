package com.pidkui.program_logic;

/*
29-Program to check whether the number is palindrome or not.
   Example, 121 is palindrome when we reverse it we get same 121.
            123 is not palindrome because when we reverse it we get 321.
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[]) {
        int num, temp, revNum = 0;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;

        while (temp > 0) {
            revNum = revNum * 10;
            revNum = revNum + (temp % 10);
            temp = temp / 10;
        }

        if (num == revNum) {
            System.out.println(num + " is a palindrome number!");
        } else {
            System.out.println(num + " is not a palindrome number!");
        }
    }
}
