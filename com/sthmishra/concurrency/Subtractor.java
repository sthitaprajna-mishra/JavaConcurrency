package com.sthmishra.concurrency;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() {
        for(int i = 1; i <= 50000; i++) {
            this.v.value -= i;
        }

        return null;
    }
}
