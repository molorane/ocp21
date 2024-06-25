package com.blessing.enthware.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 7);
        map.merge("b", 1, (oldValue, newValue) -> oldValue + newValue);
        map.merge("c", null, (a, b) -> a + b);
        System.out.println(map);
    }

}
