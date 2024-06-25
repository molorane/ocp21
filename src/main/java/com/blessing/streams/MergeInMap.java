package com.blessing.streams;

import java.util.HashMap;
import java.util.Map;

public class MergeInMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> map = new HashMap<>();

        map.put(3, 1);
        map.put(2, 4);

        map.merge(1, 3, (x, y) -> x + (y * 4));

        System.out.println(map.toString());
    }

}
