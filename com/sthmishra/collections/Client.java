package com.sthmishra.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);

        Integer[] arr = alist.toArray(new Integer[0]);

        for(int x : arr) {
            System.out.println(x);
        }

//        System.out.println(alist.set(1, 100));

        List<Integer> alist2 = new ArrayList<>(alist);
        alist2.add(4);
        alist2.add(5);
        alist2.add(6);
        alist2.addAll(alist);

        System.out.println(alist2.indexOf(2));
        System.out.println(alist2.lastIndexOf(2));

        List<Integer> alist3 = alist2.subList(2, 4);
        alist3.set(0, 100);

//        Iterator<Integer> iterator = list.iterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        System.out.println(alist);
        System.out.println(alist2);
        System.out.println(alist3);

//        for(int x : alist) {
//            System.out.println(x);
//        }

        ArrayList<Integer> tenEmployees = new ArrayList<>();
        tenEmployees.ensureCapacity(10);

    }
}
