package com.pidkui.interface_demo;

/*
81-Types of interfaces :
	-> Marker interface : interface without any methods (blank interface)
	-> Single Abstract Method (SAM) (Functional Interface) : interface with only one method
	-> Normal Interface : every interface other than above is a normal interface
*/

interface AN {		// Functional Interface
    void show();
}

public class InterfaceDemo4 {
    public static void main(String[] args) {
        // Lambda expression (introduce in Java 1.8) used with Functional Interface
        // Here we can remove the extra code which is obvious in RHS of assignment operator (=)

        AN obj = () -> {
            System.out.println("In show AN");
        };

        // here we have only one statement, so we can also write it like this :
//        AN obj = () -> System.out.println("in show AN");

        obj.show();
    }
}
