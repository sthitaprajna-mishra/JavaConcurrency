package com.sthmishra.concurrency;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            System.out.println("Lambda running");
            System.out.println("Lambda finished");
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
