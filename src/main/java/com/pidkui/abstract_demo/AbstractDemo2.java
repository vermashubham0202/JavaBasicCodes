package com.pidkui.abstract_demo;

/*
77-Program to demonstrate another use of abstract class in Java.
*/

public class AbstractDemo2 {
    public static void main(String[] args) {
        Iphone obj1 = new Iphone();
        show(obj1);

        Samsung obj2 = new Samsung();
        show(obj2);

        // instead of creating reference of concrete class (like above)
        // we can create reference of abstract class and object of concrete class
        Phone obj3 = new Iphone();
        show(obj3);

        Phone obj4 = new Samsung();
        show(obj4);
    }

    public static void show(Phone obj) {
        obj.showConfig();
    }
}

abstract class Phone {
    public abstract void showConfig();
}

class Iphone extends Phone {
    @Override
    public void showConfig() {
        System.out.println("Iphone 6, 1GB RAM, 16GB ROM");
    }
}

class Samsung extends Phone {
    @Override
    public void showConfig() {
        System.out.println("Redmi 4, 4GB RAM, 64GB ROM");
    }
}
