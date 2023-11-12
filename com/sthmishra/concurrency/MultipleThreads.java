package com.sthmishra.concurrency;

public class MultipleThreads {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " thread running...");
        };

        Thread thread1 = new Thread(runnable, "Thread 1");
        thread1.start();

        Thread thread2 = new Thread(runnable, "Thread 2");
        thread2.start();
    }
}
