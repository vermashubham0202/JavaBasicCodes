package com.pidkui.string_demo;

/*
96-Program to split string from CSV (Comma Separated Values) in Java.
*/

public class StringSplitCSV {
    public static void main(String[] args) {
        String str = "Shubham, Akki, Yogita, Pidoku, Pidkui";

        // split method will give you an array
        // where each index contains separated value
        String names[] = str.split(", ");   // enter that character with which you want to separate

        for (String s : names) {
            System.out.println(s);
        }
    }
}
