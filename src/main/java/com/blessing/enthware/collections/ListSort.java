package com.blessing.enthware.collections;

import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        List<Integer> aList = List.of(40, 30, 20); // 1
        List<Integer> bList = List.copyOf(aList); // 2
        bList.sort((Integer::compare)); // 3
        System.out.println(bList); // 4
        aList.sort((Integer::compare)); // 5
        System.out.println(aList); // 6
    }

}
