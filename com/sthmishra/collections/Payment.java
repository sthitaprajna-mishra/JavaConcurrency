package com.sthmishra.collections;

public class Payment {
    private PaymentStatus status;

    public Payment() {
        this.status = PaymentStatus.PENDING;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
