package com.pidkui.exception_handling_demo;

/*
106-Program to demonstrate manually throwing the error using the 'throw' keyword in Java.
-> In the below program we want to throw an exception if sum is less than 10.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo8 {
    public static void main(String[] args) {
        int num1, num2, sum = 0;
        BufferedReader br = null;

        try {
            System.out.println("Enter two numbers : ");
            br = new BufferedReader(new InputStreamReader(System.in));
            num1 = Integer.parseInt(br.readLine());
            num2 = Integer.parseInt(br.readLine());

            sum = num1 + num2;

            if (sum < 10) {
                // we are forcefully throwing an error
                throw new ArithmeticException();
            }
            System.out.println("Sum is : " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Minimum sum should be 10.");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid number.");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Bye!");
        }
    }
}
