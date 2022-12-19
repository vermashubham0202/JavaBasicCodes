package com.pidkui.string_demo;

/*
89-Program to demonstrate toString() method in Java.
*/

public class DemoToString {
    public static void main(String[] args) {
        BA s1 = new BA(2, "Shubham");
//		System.out.println(s1.toString());	// -> toString() method called automatically
		
		/* Whenever we try to print object by default it will call a method toString();
		   there is no method named as toString in class BA, but it is present in Object class
		   and because of inheritance it becomes the part of BA class. */

        /* We can override this method in our BA class in such a way, so that if we print
           the object then it will print its values. */

        System.out.println(s1);
    }
}

class BA extends Object {    // by default every class in Java extends Object class
    int rollNo;
    String name;

    public BA(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Roll Number : " + rollNo + "\nName : " + name);
    }
}
