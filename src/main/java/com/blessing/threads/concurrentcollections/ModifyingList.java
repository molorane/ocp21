package com.blessing.threads.concurrentcollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ModifyingList {

    public static void main(String[] args) {

        List<String> aList = new LinkedList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        Iterator listIter = aList.iterator();
        for (String s : aList) {
            System.out.println(s);
            aList.add("four");
        }
    }
}