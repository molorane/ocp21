package com.blessing.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = List.of(3, 2, 1, 3);
        System.out.println(birthdayCakeCandles(list));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < candles.size(); i++) {

            if (candles.get(i) > max) {
                max = candles.get(i);
            }
            if (map.get(candles.get(i)) != null) {
                map.put(candles.get(i), map.get(candles.get(i)) + 1);
            } else {
                map.put(candles.get(i), 1);
            }
        }

        System.out.println(map);
        System.out.println(max);

        return map.get(max);

    }

}
