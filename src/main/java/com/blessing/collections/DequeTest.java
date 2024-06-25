package com.blessing.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The removed element is: " + deque.remove());
    }
}