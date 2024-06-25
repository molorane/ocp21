package com.blessing.generic;

import java.util.ArrayList;
import java.util.List;

class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}

public class UtilitiesTest {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The original list is: " + intList);
        Utilities.fill(intList, 100);
        System.out.println("The list after calling Utilities.fill() is: " + intList);

    }

    public static void p(List<Number> ls) {
        List<?> wildCardList = new ArrayList<Integer>();
        //wildCardList.add(10);
        System.out.println(wildCardList);
    }

    public static void p() {
        List<?> wildCardList = new ArrayList<Integer>();
        //wildCardList.add(10);
        System.out.println(wildCardList);
    }

}
