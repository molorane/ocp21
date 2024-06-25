package com.blessing.enthware.enums;

import java.util.HashSet;
import java.util.TreeSet;

enum SIZE {
    TALL, JUMBO, GRANDE;
}

public class CoffeeMug {

    public static void main(String[] args) {
        var hs = new HashSet<SIZE>();
        hs.add(SIZE.TALL);
        hs.add(SIZE.JUMBO);
        hs.add(SIZE.GRANDE);
        hs.add(SIZE.TALL);
        hs.add(SIZE.TALL);
        hs.add(SIZE.JUMBO);

        for (SIZE s : hs)
            System.out.print(s + " ");
        System.out.println();
        var hs1 = new TreeSet<SIZE>();
        hs1.add(SIZE.GRANDE);
        hs1.add(SIZE.TALL);
        hs1.add(SIZE.TALL);
        hs1.add(SIZE.JUMBO);
        hs1.add(SIZE.TALL);
        hs1.add(SIZE.JUMBO);
        for (SIZE s : hs1)
            System.out.print(s + " ");
    }

}
