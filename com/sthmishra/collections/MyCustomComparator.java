package com.sthmishra.collections;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1-o2; // ascending
        return o2-o1; // descending
    }
}
