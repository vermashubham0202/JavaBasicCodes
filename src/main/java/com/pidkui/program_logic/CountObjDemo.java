package com.pidkui.program_logic;

/*
56-Program to count number of objects of class in Java.
*/

public class CountObjDemo {
    public static void main(String[] args) {
        G obj1 = new G();
        G obj2 = new G();
        G obj3 = new G();
        G obj4 = new G();

        obj1.count();    // you can call with any object
    }
}

class G {
    static int count;

    public G() {
        count++;
    }

    public void count() {
        System.out.println("Total Objects: " + count);
    }
}
