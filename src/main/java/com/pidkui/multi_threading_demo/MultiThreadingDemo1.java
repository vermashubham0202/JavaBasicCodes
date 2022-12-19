package com.pidkui.multi_threading_demo;

/*
120-Program to demonstrate Multi-threading using Thread class in Java.
-> Uses of threads:
	- Using complete power of CPU.
	- Async-task in Android
	- Web Application
	- Gaming

-> We can create threads by extending Thread class.

-> Another way of creating a thread class is by using 'Runnable' interface.
   This can be used when your class already extends some class, and you can not do multiple inheritance
   in Java.
   Example,
   class MyThread extends A implements Runnable {}
*/

public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        // Thread is an inbuilt class in Java
        Hi h1 = new Hi();
        Hello h2 = new Hello();

        h1.start();    // start() method will call run() method internally
        h2.start();
    }
}

class Hi extends Thread {
    public void run() {		// whenever you create thread
							// it is your responsibility to override run() method
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
