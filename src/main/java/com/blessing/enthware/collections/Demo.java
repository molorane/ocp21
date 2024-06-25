package com.blessing.enthware.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d.peekFirst());
    }

}
