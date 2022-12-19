package com.pidkui.inheritance_demo;

/*
61-Program to demonstrate single-level inheritance in Java.
-> Single level and Multi-level inheritance are supported by Java.
-> Multiple inheritance is not supported by Java.
*/

import java.util.Scanner;

public class InheritanceDemo1 {
    public static void main(String[] args) {
        int x, y;

        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        J obj = new J();
        obj.setNum1I(x);
        obj.setNum2I(y);
        obj.setNum1J(x);
        obj.setNum2J(y);

        obj.sub();
        obj.add();

        System.out.println("Subtraction is : " + obj.getResultSub());
        System.out.println("Sum is : " + obj.getResultAdd());
    }
}

class I {    // Parent class, Super class, Base class
    private int num1, num2, result;

    public void setNum1I(int n1) {
        num1 = n1;
    }

    public void setNum2I(int n2) {
        num2 = n2;
    }

    public void add() {
        result = num1 + num2;
    }

    public int getResultAdd() {
        return result;
    }
}

class J extends I {        // Child class, Sub class, Derived class
    private int num1, num2, result;

    public void sub() {
        result = num1 - num2;
    }

    public void setNum1J(int n1) {
        num1 = n1;
    }

    public void setNum2J(int n2) {
        num2 = n2;
    }

    public int getResultSub() {
        return result;
    }
}
