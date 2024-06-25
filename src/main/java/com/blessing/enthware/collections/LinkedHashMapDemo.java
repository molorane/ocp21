package com.blessing.enthware.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        System.out.println(map);
        map.put("2", 2);
        System.out.println(map);
    }

}
