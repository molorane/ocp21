package com.blessing.threads.concurrentcollections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollection3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
        list.add(2);

        CopyOnWriteArraySet<Integer> list2 = new CopyOnWriteArraySet<Integer>();
        list2.add(3);
        list2.add(3);
        System.out.println(list2);
    }

}
