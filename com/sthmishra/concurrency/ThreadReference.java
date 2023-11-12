package com.sthmishra.concurrency;

public class ThreadReference {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName(); // fetch our new thread's name
            System.out.println(threadName + " running");
        }
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        // fetch the name of the current running thread, i.e., the main thread by JVM
        System.out.println(Thread.currentThread().getName() + " running in main method");

        Thread thread = new Thread(obj, "MyRunnableMod"); // pass in the name of the thread
        thread.start();
    }
}