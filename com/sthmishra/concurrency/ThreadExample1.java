package com.sthmishra.concurrency;

public class ThreadExample1 {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThreadObj = new MyThread();
        myThreadObj.start();
    }
}
