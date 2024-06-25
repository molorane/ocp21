package com.blessing.enthware.collections;

import java.util.Arrays;

public class ArraysCompare2 {

    public static void main(String[] args) {

        var a = new int[]{1, 2, 3, 4, 7};
        var b = new int[]{1, 2, 3, 4, 5, 8};
        var c = new int[]{1, 2, 3, 4, 5, 8, 9, 0};
        int x = Arrays.compare(a, c);
        int y = Arrays.compare(b, c);
        System.out.println(x + " " + y);

        Integer[] ia1 = {1};
        Integer[] ia2 = {};
        System.out.println(Arrays.compare(ia1, ia2));
    }

}
