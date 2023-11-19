package com.sthmishra.collections;

import java.util.*;

public class Client4 {
    public static void main(String[] args) {
        Payment payment1 = new Payment();

        payment1.setStatus(PaymentStatus.SUCCESS);

//        System.out.println(payment1.getStatus());

        Set<PaymentStatus> allPaymentStatus = EnumSet.allOf(PaymentStatus.class);
        for(PaymentStatus p : allPaymentStatus) {
            System.out.println(p);
        }

    }
}
