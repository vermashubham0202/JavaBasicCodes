package com.pidkui.exception_handling_demo;

/*
101-Program to demonstrate Exception Handling for those exceptions
which you don't know but might be possible at run time in Java.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo3 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, quotient = 0;

		int a[] = new int[4];
		
		System.out.println("Enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			// Unchecked Exception
			quotient = num1 / num2;
			System.out.println("Quotient of " + num1 + " by " + num2 + " is : " + quotient);
			
			// inserting values in array (this exception will be handled by last catch here)
			for(int i = 0; i <= 4; i++) {
				a[i] = i * 2;
			}
			
			for(int value : a) {
				System.out.println(value);
			}
		} catch(InputMismatchException e) {
			System.out.println("Please enter numbers not other characters : " + e);
		} catch(ArithmeticException e) {
			System.out.println("Number can not be divided by 0");
		} catch(Exception e) {	/* Always write your main 'Exception' as a last catch
								because if you write it above all other exception then it will give
								an error. It is enough for handling all the exceptions then why we
								write all other exception below it. (Unreachable catch blocks error for
								other blocks) */
			System.out.println("Unknown Exception");
		}
	}
}
