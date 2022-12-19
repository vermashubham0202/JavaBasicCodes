package com.pidkui.multi_threading_demo;

/*
124-Program to set thread's name and how to set priorities of the threads in Java.
-> Setting thread name will be important if you are working on multiple threads, and you want to know
	which thread is doing what.
*/

public class MultiThreadingDemo5 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-Hello");    // we can also set thread name while creating thread object

        System.out.println(t1.getName());    // Thread-Hi
        System.out.println(t2.getName());    // Thread-Hello

        // setting thread names
        t1.setName("Thread-Hi");
//        t2.setName("Thread-Hello");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        /*
         * Whenever you create any thread it will have default priority.
         * Range of priorities goes from 1(least) to 10(highest).
         */

        System.out.println(t1.getPriority());    // 5 (Normal Priority)
        System.out.println(t2.getPriority());    // 5

        // changing t1's and t2's priority
        t1.setPriority(Thread.MIN_PRIORITY);    // you can also write like : t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);    // t2.setPriority(10);

        System.out.println(t1.getPriority());    // 10
        System.out.println(t2.getPriority());    // 1

        t1.start();
        t2.start();

		// Pausing main thread till both the threads t1 and t2 complete there task
		// join() method will make your main thread to wait for t1 and t2 to join again
        t1.join();
        t2.join();

        System.out.println("Bye");
    }
}
