package com.sthmishra.lambdasandstreams;

import java.util.*;
import java.util.stream.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) myList.add(i);

        Stream<Integer> myStream = myList.stream();
//        myStream.forEach((e) -> System.out.println(e));
//        myStream.forEach(System.out::println);

        // Intermediate Methods - filter

        // Terminal Methods - foreach is a terminal method, we cannot lazily evaluate this
        // once a terminal operation is done on a stream, it is closed, we need to open a new stream to work on data source

        Stream<Integer> myStream1 = myList.stream();
        Optional<Integer> temp = myStream1
                .filter((e) -> {
                    System.out.println("Filter applied on element " + e);
                    return e%2 == 0;
                })
                .sorted()
                .map(e -> e + 5)
                .findFirst();
//                .collect(Collectors.toList());
//                .forEach((e) -> System.out.println("Displaying " + e));

        if(temp.isPresent()) {
            System.out.println(temp.get());
        }

        System.out.println(temp);
    }
}
