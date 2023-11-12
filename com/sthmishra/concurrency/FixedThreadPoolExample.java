package com.sthmishra.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 100; i++) {
            int taskId = i+1;
            Runnable runnable = () -> {
              String currentThreadName = Thread.currentThread().getName();
              System.out.println("Task " + taskId + " executed by thread " + currentThreadName);
            };
            fixedThreadPool.execute(runnable);
        }

        fixedThreadPool.shutdown();
    }
}
