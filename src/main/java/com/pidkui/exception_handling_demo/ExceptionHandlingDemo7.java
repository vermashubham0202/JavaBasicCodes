package com.pidkui.exception_handling_demo;

/*
105-Program to demonstrate suppressing the error using the 'throws' keyword in Java.
-> This is for lazy persons. ;)
-> With it we are not handling the error.
-> If you want to be efficient programmer, always go with try/catch block.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num1, num2, sum = 0;

        System.out.println("Enter two numbers : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
}
