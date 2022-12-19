package com.pidkui.multi_threading_demo;

/*
126-Program to demonstrate Inter-thread communication in Java using producer consumer problem.
-> Thread.sleep() - When you are asking for some time to sleep,
					after that time it will come back automatically.
-> sleep() is a thread method.

-> wait(); - It will wait till someone notify to wake-up.
			(Always make the method 'synchronized' in which you are using wait();)
-> wait() and notify() methods belong to object class
   and by default every class extends Object class, so we don't require
   any class name to call these methods, or they can work with any class object.
*/

public class MultiThreadingDemo7 {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
    }
}

class Q {
    int num;
    boolean flag = false;

    public synchronized void put(int num) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put : " + num);
        this.num = num;
        flag = true;
        notify();    // this will notify consumer's thread
    }

    public synchronized void get() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get : " + num);
        flag = false;
        notify();    // this will notify producer's thread
    }
}

// Producer class
class Producer implements Runnable {
    Q obj;

    public Producer(Q obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            obj.put(i++);
            try {
                Thread.sleep(1000);    // Producer is producing after every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    Q obj;

    public Consumer(Q obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            obj.get();
            try {
                Thread.sleep(5000);    // Consumer is consuming after every 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
