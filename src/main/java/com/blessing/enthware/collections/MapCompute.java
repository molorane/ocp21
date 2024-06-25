package com.blessing.enthware.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapCompute {


    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, null);

        System.out.println(map);

        map.compute(1, (key, oldVal) -> oldVal.concat("Script"));
        map.compute(2, (key, oldVal) -> "Framework");
        map.computeIfPresent(2, (key, oldVal) -> null);
        System.out.println(map);

        // removes key bcoz compute returns null
        String r1 = map.compute(1, (key, oldVal) -> null);
        System.out.println(r1);

        // removes key bcoz compute returns null
        String r2 = map.compute(2, (key, oldVal) -> null);
        System.out.println(r2);
        System.out.println(map);
    }

}
