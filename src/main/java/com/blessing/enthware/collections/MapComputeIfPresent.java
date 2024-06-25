package com.blessing.enthware.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapComputeIfPresent {


    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");

        System.out.println(map);

        map.computeIfPresent(1, (key, oldVal) -> oldVal.concat("Script"));
        map.computeIfPresent(2, (key, oldVal) -> oldVal.concat("Framework"));
        System.out.println(map);

        // removes key bcoz compute returns null
        String r1 = map.computeIfPresent(1, (key, oldVal) -> null);
        System.out.println(r1);

        // does not removes key bcoz eventhough compute returns null key is null
        String r2 = map.computeIfPresent(2, (key, oldVal) -> null);
        System.out.println(r2);
        System.out.println(map);
    }

}
