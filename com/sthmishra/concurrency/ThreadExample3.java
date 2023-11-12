package com.sthmishra.concurrency;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyAnonRunnableThread running");
                System.out.println("MyAnonRunnableThread finished");
            }
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
