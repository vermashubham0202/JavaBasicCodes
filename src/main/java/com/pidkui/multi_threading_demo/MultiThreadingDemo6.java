package com.pidkui.multi_threading_demo;

/*
125-Program to demonstrate Multi-threading Synchronized keyword in Java.
-> In below example when two threads are doing increment at the same time, the count++ statement
	creates problem because there is no mutual exclusion.
-> To solve this issue we have to make our method increment 'synchronized', so that only one
	thread is able to access it at a particular time.
-> When you don't make your method synchronized then your method or your object counter 
	is not thread safe.
*/

public class MultiThreadingDemo6 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        }
        );

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter is : " + c.count);
    }
}

class Counter {
    int count;

    // only one thread can access increment method
    // at a time because it is synchronized
    public synchronized void increment() {
        count++;    // count = count + 1 (Two actions performed)
                    // two actions - Addition and Assignment
    }
}
