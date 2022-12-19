package com.pidkui.multi_threading_demo;

/*
123-Program to demonstrate Multi-threading join() and isAlive() method in Java.
*/

public class MultiThreadingDemo4 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
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

        // isAlive() method is used to check weather thread is alive or not
        System.out.println(t1.isAlive());
		
		// Pausing main thread till both the threads t1 and t2 complete there task
        // join() method will make your main thread to wait for t1 and t2 to join again
        t1.join();
        t2.join();

        // isAlive() method is used to check weather thread is alive or not
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
