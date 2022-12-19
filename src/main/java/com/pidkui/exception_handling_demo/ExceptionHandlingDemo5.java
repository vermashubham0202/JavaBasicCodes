package com.pidkui.exception_handling_demo;

/*
103-Program to demonstrate use of finally block in Exception Handling in Java.
-> Doesn't matter if your code gives an error or not, but this block will be executed at the end.
-> It is mainly used in closing the resources.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo5 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, quo = 0;

        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);

        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            // Unchecked Exception
            quo = num1 / num2;
            System.out.println("Quotient of " + num1 + " by " + num2 + " is : " + quo);
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers not other characters : " + e);
        } catch (ArithmeticException e) {
            System.out.println("Number can not be divided by 0");
        }

        // this block will be executed either there is an exception or not
        finally {
            // closing scanner object
            sc.close();
            System.out.println("Bye!");
        }
    }
}
