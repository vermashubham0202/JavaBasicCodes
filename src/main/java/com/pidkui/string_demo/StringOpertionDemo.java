package com.pidkui.string_demo;

/*
88-Program to accept two strings from user and perform the following operations:
	-> Find out the length of both the strings.
	-> Concatenation of two Strings.
	-> Convert first string into UPPERCASE.
*/

import java.util.Scanner;

public class StringOpertionDemo {
    public static void main(String[] args) {
        String str1, str2, conStr, upperStr1;
        int lenStr1, lenStr2;

        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        str2 = sc.nextLine();

        // getting length of both the strings
        lenStr1 = str1.length();
        lenStr2 = str2.length();

        System.out.println("Length of first string: " + lenStr1);
        System.out.println("Length of second string: " + lenStr2);

        // concatenating str1 and str2
        conStr = str1.concat(str2);
        System.out.println("Concatenated String: " + conStr);

        // other way of concatenation
        conStr = str1 + " " + str2;
        System.out.println("Concatenated String: " + conStr);

        // converting first string into UPPERCASE
        upperStr1 = str1.toUpperCase();
        System.out.println("Uppercase first string output: " + upperStr1);
    }
}
