package com.sthmishra.collections;

import java.util.*;

public class Client3 {
    public static void main(String[] args) {
        Queue<Integer> fifoQ = new LinkedList<>();

        fifoQ.offer(1);
        fifoQ.offer(2);
        fifoQ.offer(3);
        fifoQ.offer(4);

//        System.out.println(fifoQ.peek());
//        System.out.println(fifoQ.poll());

//        System.out.println(fifoQ.isEmpty());

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        dq.offerLast(5);
        dq.offerLast(6);
        dq.offerLast(7);
        dq.offerLast(8);

        System.out.println(dq);

        // 4 3 2 1 5 6 7 8

        dq.pollFirst();
        dq.pollLast();

        System.out.println(dq.peekFirst()); // 3
        System.out.println(dq.peekLast()); // 7

    }
}
