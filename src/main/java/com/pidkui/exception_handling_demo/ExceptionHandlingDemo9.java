package com.pidkui.exception_handling_demo;

/*
107-Program to demonstrate User Defined Exception in Java.
-> You can create general Exception, IOException or any exception by inheriting that class.
*/

public class ExceptionHandlingDemo9 {
    public static void main(String[] args) {
        int i = 5;

        try {
            if (i < 10) {
                // checked exception
                throw new MyException("Error!!");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        // constructor of exception class is called
        super(msg);
    }
}
