package com.sthmishra.concurrency;

import java.util.concurrent.*;

public class AdderSubtractor1 {
    public static void main(String[] args) throws Exception {
        Value v = new Value();
        Adder x = new Adder(v);
        Subtractor y = new Subtractor(v);

        ExecutorService ex = Executors.newCachedThreadPool();

        Future<Void> adderFuture = ex.submit(x);
        Future<Void> subtractorFuture = ex.submit(y);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
