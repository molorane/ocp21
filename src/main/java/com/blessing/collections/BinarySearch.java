package com.blessing.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7);
        //Collections.sort(list);

        int i = Collections.binarySearch(list, 4, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        });
        System.out.println(i);
    }

}
