package com.pidkui.miscellaneous_topics;

/*
47-Program to demonstrate Var-args (Variable Arguments).
It will be used when you don't know how many parameters user will send.
*/

public class VarArgsDemo {
    public static void main(String[] args) {
        Display obj = new Display();

        obj.show(5);        // it will call show(int a){} because there is an exact match
        obj.show(7, 6);
        obj.show(8, 3, 4);
    }
}

class Display {
    public void show(int... a) { /* Here 'a' is an array, but we don't write it like this 'a[]'
									because it will create confusion for compiler that we are passing values or
									array to this Method.
									It is implemented in : Arrays.asList(T... a) */
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void show(int a) {
        System.out.println(a + " in show one argument");
    }
}
