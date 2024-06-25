package com.blessing.threads.concurrentcollections;

import java.util.concurrent.*;

public class ConcurrentCollection1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcurrentMap<ConcurrentCollection1, String> list = new ConcurrentHashMap<>();

        ConcurrentNavigableMap<ConcurrentCollection1, String> list1 = new ConcurrentSkipListMap<>();

        list1.put(new ConcurrentCollection1(), "Lo");

        ConcurrentSkipListSet<Integer> l;
    }

}
