package com.pidkui.user_input_demo;

/*
93-Program to take user input using Scanner Class in Java.
*/

import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Your input is: " + num);
    }
}
