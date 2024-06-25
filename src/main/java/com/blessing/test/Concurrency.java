package com.blessing.test;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Concurrency {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> copy3 = new LinkedList<>(original);
        for (Integer w : copy3)
            copy3.remove(w);

        Queue<Integer> copy4 = new ConcurrentLinkedQueue<>(original);
        for (Integer w : copy4)
            copy4.remove(w);

        System.out.println(copy3);
    }

}
