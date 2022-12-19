package com.pidkui.inheritance_demo;

/*
62-Program to demonstrate multi-level inheritance in Java.
*/

import java.util.Scanner;

public class InheritanceDemo2 {
    public static void main(String[] args) {
        int num1, num2, op;

        Scanner sc = new Scanner(System.in);
        System.out.println("Which Operation you want to perform : ");
        System.out.println("1. Add \n2. Subtraction \n3. Multiplication");
        op = sc.nextInt();

        if (op < 1 || op > 3) {
            System.out.println("Invalid input!");
            System.exit(1);    // terminate program
        }

        System.out.println("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        M obj = new M();
        obj.setNum1(num1);
        obj.setNum2(num2);

        if (op == 1) {
            obj.add();
            System.out.println("Addition is : " + obj.getResult());
        } else if (op == 2) {
            obj.sub();
            System.out.println("Subtraction is : " + obj.getResult());
        } else {
            obj.mul();
            System.out.println("Multiplication is : " + obj.getResult());
        }
    }
}

class K {
    protected int num1, num2, result;

    public void setNum1(int n1) {
        num1 = n1;
    }

    public void setNum2(int n2) {
        num2 = n2;
    }

    public void add() {
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }
}

class L extends K {
    public void sub() {
        result = num1 - num2;
    }
}

class M extends L {
    public void mul() {
        result = num1 * num2;
    }
}
