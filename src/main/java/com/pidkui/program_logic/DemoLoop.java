package com.pidkui.program_logic;

/*
20-Program to demonstrate while, do while and for loop.
 */

public class DemoLoop {
    public static void main(String args[]) {
        int i = 1;

        /* while loop first check the condition 
           then it execute the code inside it. */
        System.out.println("Output by 'while' loop : ");

        while (i < 6) {
            System.out.println(i);
            i++;
        }

        /* 'do while' first execute the statement and 
            then it check the condition. */
        i = 7;

        System.out.println("Output by 'do while' loop : ");

        do {
            System.out.println(i);
            i++;
        } while (i < 6);

        /* In 'for' loop, initialization, condition checking and increment is
           done in same line. */
        System.out.println("Output by 'for' loop : ");

        for (i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}
