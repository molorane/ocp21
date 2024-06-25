package com.blessing.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.stream.Stream;

public class QueueTest {

    public static void main(String[] args) {

        TreeSet t;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 1. get stream and use lambda expression
        queue.stream().forEach(S -> {
            System.out.print(S);
        });
        System.out.println();
        // shorthand for above code
        queue.stream().forEach(S -> System.out.print(S));

        System.out.println();
        // 2. or by providing method reference
        queue.stream().forEach(System.out::print);

        System.out.println();
        // 3. queue inherit forEach() from Iterable interface
        queue.forEach(System.out::print);

        System.out.println();
        // 4. iterator() is inherited from java.util.Collection interface
        queue.iterator().forEachRemaining(System.out::print);

        System.out.println();
        // 5. Stream.of() + toArray() + forEach()
        Stream.of(queue.toArray()).forEach(System.out::print);
    }

}
