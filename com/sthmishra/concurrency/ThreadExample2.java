package com.sthmishra.concurrency;

public class ThreadExample2 {
    public static class MyRunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnableThread running");
            System.out.println("MyRunnableThread finished");
        }
    }

    public static void main(String[] args) {
        MyRunnableThread myThreadObj = new MyRunnableThread();

        Thread thread = new Thread(myThreadObj);
        thread.start();
    }
}
