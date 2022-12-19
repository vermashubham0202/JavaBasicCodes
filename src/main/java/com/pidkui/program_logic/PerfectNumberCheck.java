package com.pidkui.program_logic;

/*
30-Program to check whether the number is a perfect number or not.
Eg. 6 -> factors of 6 excluding 6 itself. (1, 2, 3)
        1 + 2 + 3 = 6 (So it is a perfect number.)

Eg. 28 -> 1 + 2 + 4 + 7 + 14 = 28 (So it is a perfect number.)
 */

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String args[]) {
        int num, halfNum, i, sum = 0;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        halfNum = num / 2;

        for (i = 1; i <= halfNum; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number!");
        } else {
            System.out.println(num + " is not a perfect number!");
        }
    }
}
