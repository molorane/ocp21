package com.blessing.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDotCopy {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<String> fruits = new ArrayList<String>();
        fruits.add("Banna");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Nomfundo");

        List<String> copy3 = new ArrayList<String>();
        copy3.add("Peach");
        copy3.add("Orange");
        copy3.add("Pineapple");
        copy3.add("Cucumba");
        copy3.add("Again");
        System.err.println(copy3);
        Collections.copy(copy3, fruits);

        System.err.println(copy3);

    }

}
