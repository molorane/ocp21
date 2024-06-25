package com.blessing.enthware.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapComputeIfAbsent {


    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, null);
        map.put(3, null);

        System.out.println(map);

        map.computeIfAbsent(1, (key) -> "Script");
        map.computeIfAbsent(2, (key) -> "Framework");
        System.out.println(map);

        // does not remove key bcoz key present
        String r1 = map.computeIfAbsent(1, (key) -> null);
        System.out.println(r1);
        System.out.println(map);

        // does not remove key bcoz key present
        String r2 = map.computeIfAbsent(2, (key) -> null);
        System.out.println(r2);
        System.out.println(map);

        // does not removes key bcoz key present
        String r3 = map.computeIfAbsent(3, (key) -> "thu");
        System.out.println(r3);
        System.out.println(map);
    }

}
