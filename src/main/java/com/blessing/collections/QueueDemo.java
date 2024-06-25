package com.blessing.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.add(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
        System.out.println(queue.poll()); //
    }

}
