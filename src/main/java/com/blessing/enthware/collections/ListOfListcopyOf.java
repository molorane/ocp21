package com.blessing.enthware.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfListcopyOf {

    public static void main(String[] args) {
        p1();
    }


    public static void p1() {
        Set<Number> col = new HashSet<>();
        col.add(1);
        var list1 = List.of(col); //1
        System.out.println(list1);
        col.add(2); //2
        var list2 = List.copyOf(col); //3
        col.add(3); //2
        System.out.println(list1 + ", " + list2);
    }

    public static void p2() {
        int[] col = {1, 2, 3, 4, 5};

        var list1 = List.of(col); //1
        System.out.println(list1);
        col = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(list1);
    }

}
