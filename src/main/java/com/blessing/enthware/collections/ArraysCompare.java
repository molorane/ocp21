package com.blessing.enthware.collections;

import java.util.Arrays;

public class ArraysCompare {

    public static void main(String[] args) {

        int[] ia1 = {2, 0, 4, 5};
        int[] ia2 = {2, 1, 1, 5, 6};
        int x = Arrays.compare(ia1, ia2);
        int y = Arrays.mismatch(ia1, ia2);
        System.out.println(x + " " + y);
    }

}
