package com.sthmishra.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        OurGenericList<Integer> list = new OurGenericList<>();
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);

//        System.out.println(alist.set(1, 100));

        List<Integer> alist2 = new ArrayList<>(alist);
        alist2.add(4);

//        Iterator<Integer> iterator = list.iterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println(alist);
        System.out.println(alist2);


//        for(int x : alist) {
//            System.out.println(x);
//        }

    }
}
