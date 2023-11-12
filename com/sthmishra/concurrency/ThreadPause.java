package com.sthmishra.concurrency;

public class ThreadPause {
    public static void main(String[] args) {
        Runnable threadObj = () -> {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(currentThreadName + " running...");

            try {
                Thread.sleep(2000);
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            System.out.println(currentThreadName + "finished.");
        };

        Thread thread = new Thread(threadObj, "CustomThread1");
        thread.start();

        System.out.println(Thread.currentThread().getName() + " running in main method...");
    }
}
