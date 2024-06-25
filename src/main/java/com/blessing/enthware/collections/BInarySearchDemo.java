package com.blessing.enthware.collections;

import java.util.Arrays;
import java.util.Comparator;

class MyStringComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }
}

public class BInarySearchDemo {

    static String[] sa = {"d", "bbb", "aaaa"};

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Arrays.sort(sa, new MyStringComparator());
        System.out.println(Arrays.toString(sa));

        int i = Arrays.binarySearch(sa, "cc", new MyStringComparator());
        System.out.println(i);

        int i1 = Arrays.binarySearch(sa, "", new MyStringComparator());
        System.out.println(i1);
    }

}
