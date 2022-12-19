package com.pidkui.user_input_demo;

/*
92-Program to take user input using Buffered Reader in Java.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws NumberFormatException, IOException {
		// to create object of BufferedReader
        // first we need to create the object
		// of InputStreamReader class, so that its object
        // can be passed to BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);

        // now we are creating object of BufferedReader
        BufferedReader br = new BufferedReader(isr);

		// in BufferedReader isr is passed only once, so we can also write like below:
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking integer value from user
        System.out.println("Enter a number: ");

        // parseInt is static method, so we need to call it using class name "Integer"
        int num = Integer.parseInt(br.readLine());

        System.out.println("Your input is: " + num);
    }
}
