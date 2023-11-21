package com.sthmishra.collections;

import java.util.*;

public class SetClient {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        Set<Integer> set = new HashSet<>(myList);

        for(int i = 1; i <= 5; i++) set.add(i);

        set.add(2);

        Set<Integer> otherSet = new HashSet<>();
        for(int i = 3; i <= 10; i++) otherSet.add(i);

//        System.out.println("\nset");
//        System.out.println(set);
//
//        System.out.println("\notherSet");
//        System.out.println(otherSet);

//        set.retainAll(otherSet); // intersection of the 2 sets will be applied to the calling set
//        set.removeAll(otherSet); // intersection of the 2 sets will be removed from the calling set
        set.addAll(otherSet); // add the elements of the arg set to the calling set

//        System.out.println("\nset.addAll(otherSet);");
//        System.out.println("\nset");
//        System.out.println(set);
//
//        System.out.println("\notherSet");
//        System.out.println(otherSet);

        Set<Integer> set4 = new LinkedHashSet<>();
        set4.add(2);
        set4.add(4);
        set4.add(8);
        set4.add(0);
        set4.add(6);

//        System.out.println(set4);

        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(38, 10));
        stMarks.add(new StudentMarks(100, 38));
        stMarks.add(new StudentMarks(40, 88));
        stMarks.add(new StudentMarks(97, 19));

        Set<StudentMarks> set5 = new HashSet<>(stMarks);

        System.out.println(set5);

        System.out.println(set5.contains(new StudentMarks(100, 38)));

    }
}
