package com.sthmishra.collections;

import java.util.*;

public class Client2 {
    public static void main(String[] args) {
        List<Integer> lk = new LinkedList<>();

        for(int i = 1; i <= 10; i++) {
            lk.add(i);
        }

        ListIterator<Integer> listIterator = lk.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

    }
}
