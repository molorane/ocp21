package com.blessing.threads.questions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class COWArrayListTest {
    public static void main(String[] args) {
        List<Integer> aList = new CopyOnWriteArrayList<Integer>(); // LINE A
        aList.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(aList);

    }
}