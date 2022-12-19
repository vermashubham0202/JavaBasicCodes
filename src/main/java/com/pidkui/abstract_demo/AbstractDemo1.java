package com.pidkui.abstract_demo;

/*
76-Program to demonstrate abstraction in Java.
-> Abstraction means instead of focusing on main implementation we are focusing on abstract part of it.
-> If you have abstract methods in your class then your class also have to be abstract.
	But it doesn't mean that if you want to create abstract class then you have to
	create abstract methods.
-> In abstract class we can have abstract methods or normal methods or both.
-> We can not create object of abstract class.

-> Abstract methods are those methods which are declared, not defined.
	Eg.
	public abstract void login();
*/

public class AbstractDemo1 {
    public static void main(String[] args) {
//        MaheshPhone obj = new MaheshPhone();      // can not instantiate abstract class.
//        RameshPhone obj =  new RameshPhone();     // can not instantiate abstract class.

        SureshPhone obj1 = new SureshPhone();
        obj1.call();
        obj1.move();
        obj1.dance();
        obj1.cook();

        System.out.println();

        MaheshPhone obj2 = new SureshPhone();    // we can create reference of super-class
        obj2.call();                            // and object of sub-class
        obj2.move();
        obj2.dance();
        obj2.cook();

        System.out.println();

        RameshPhone obj3 = new SureshPhone();    // we can create reference of super-class
        obj3.call();                            // and object of sub-class
        obj3.move();
        obj3.dance();
        obj3.cook();
    }
}

abstract class MaheshPhone {    // abstract class
    public void call() {
        System.out.println("calling...");
    }

    // abstract methods
    public abstract void move();

    public abstract void dance();

    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone {    // abstract class
    @Override
    public void move() {
        System.out.println("moving...");
    }

    // these two methods are also present in RameshPhone (not necessary to write)
//    public abstract void dance();
//    public abstract void cook();
}

class SureshPhone extends RameshPhone {        // concrete class
    @Override
    public void dance() {
        System.out.println("dancing...");
    }

    @Override
    public void cook() {
        System.out.println("cooking...");
    }
}
