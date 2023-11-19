package com.sthmishra.collections;

import java.util.*;

public class Client4 {
    public static void main(String[] args) {
        Payment payment1 = new Payment();

        payment1.setStatus(PaymentStatus.SUCCESS);

//        System.out.println(payment1.getStatus());

        Set<PaymentStatus> allPaymentStatus = EnumSet.allOf(PaymentStatus.class);
        for(PaymentStatus p : allPaymentStatus) {
//            System.out.println(p);
        }

        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Michael Scott", 85, 25),
                new Student(2, "Dwight Schrute", 90, 26),
                new Student(3, "Jim Halpert", 87, 21)
        ));

        Collections.sort(students);

        for(Student st : students) {
//            System.out.println(st.name + " scored " + st.psp);
            System.out.println(st);
        }

    }
}
