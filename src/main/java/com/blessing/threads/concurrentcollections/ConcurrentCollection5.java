package com.blessing.threads.concurrentcollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<Integer, String> m = new HashMap<Integer, String>();
        Map<Integer, String> m1 = Collections.synchronizedMap(m);

        ConcurrentHashMap<Integer, String> m3 = new ConcurrentHashMap<>();

    }

}
