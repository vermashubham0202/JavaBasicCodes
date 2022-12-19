package com.pidkui.program_logic;

/*
32-Program to check whether the number is prime number or not.
Prime number : numbers which are divisible by 1 and itself.
*/

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String args[]) {
        int num, halfNum, i;
        boolean flag = true;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        halfNum = num / 2;

        for (i = 2; i <= halfNum; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is not a prime number!");
        }
    }
}
