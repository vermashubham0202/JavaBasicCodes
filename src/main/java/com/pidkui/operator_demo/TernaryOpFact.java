package com.pidkui.operator_demo;

/*
16-Program to demonstrate interesting fact about Ternary operator.
 */

public class TernaryOpFact {
    @SuppressWarnings({"deprecation", "unused"})
    public static void main(String args[]) {
        Object obj1, obj2;

        if (true) {
            obj1 = new Integer(10);
        } else {
            obj1 = new Double(15.0);
        }

        System.out.println(obj1);

        /* When we work with ternary operator it checks the type of both
           the values and whichever is maximum the output is converted
           into that type. */
        obj2 = (true) ? new Integer(10) : new Double(15.0);

        System.out.println(obj2);   // Output : 10.0
    }
}
