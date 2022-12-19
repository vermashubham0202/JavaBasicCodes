package com.pidkui.multi_threading_demo;

/*
122-Program to demonstrate Multi-threading using Lambda Expression in Java.
*/

public class MultiThreadingDemo3 {
    public static void main(String[] args) {
        // To call the Runnable interface object we have to create Thread class object
        // and, we have to link our Runnable object with them

        Thread t1 = new Thread(() -> {		// whenever you create thread it is your
											// responsibility to override run() method
            for (int i = 0; i < 5; i++) {
                System.out.println("Akki");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Shubham");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
