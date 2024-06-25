package com.blessing.enthware.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 8, 3, 5, 0);
        Collections.sort(list);

        System.out.println(list.getClass().getName());
    }

}
