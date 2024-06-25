package com.blessing.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachRemaining {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add(null);

        Iterator<String> iterator = fruits.iterator();

        Consumer<String> consumer = (str) -> System.out.println(str);

        iterator.forEachRemaining(consumer);
    }

}
