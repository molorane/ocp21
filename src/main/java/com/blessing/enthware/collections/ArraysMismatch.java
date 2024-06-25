package com.blessing.enthware.collections;

import java.util.Arrays;

public class ArraysMismatch {

    public static void main(String[] args) {

        var a = new int[]{1, 3, 2};
        var b = new int[]{1, 2, 3, 4, 5, 3};
        var c = new int[]{1, 2, 3, 6, 7};
        int x = Arrays.mismatch(a, c);
        System.out.println(x);

        int[] i1 = {0, 1, 4};
        int[] i2 = {1, 2, 3};
        //System.out.println(Arrays.mismatch(i1, i2));
    }

}
