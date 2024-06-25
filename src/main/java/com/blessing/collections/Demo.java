package com.blessing.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Optional<Integer> obj = Arrays.asList(1, 2, 3).parallelStream()
                .reduce((a, b) -> a * b);
        System.out.println(obj.orElse(9));

        List<Demo> ducks = new ArrayList<>();
        ducks.add(new Demo());
        ducks.add(new Demo());
        Collections.sort(ducks, (o1, o2) -> {
            return 1;
        }); // sort by name
        System.out.println(ducks);
    }

}
