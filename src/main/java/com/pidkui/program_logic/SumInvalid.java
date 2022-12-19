package com.pidkui.program_logic;

import java.util.Scanner;

public class SumInvalid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number's count: ");

        int num = sc.nextInt();
        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter number: ");
            try {
                sum += Integer.parseInt(sc.next());
            } catch (Exception e) {
                invalidCount++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Invalid inputs: " + invalidCount);
    }
}
