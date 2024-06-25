package com.blessing.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyListExamples {

    public static void main(String[] args) {

        // Using Constructor
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banna");
        fruits.add("Apple");
        fruits.add("Mange");

        System.out.println("Fruits: " + fruits);

        List<String> copy = new ArrayList<String>(fruits);

        System.out.println("Copy:  " + copy);

        // Using addAll() method
        List<String> copy2 = new ArrayList<String>();
        copy2.addAll(fruits);
        System.out.println("Copy2: " + copy2);

        // Using Collections.copy()
        // Size of the two collections must be equal
        // Meaning, they should contain equal number of elements
        List<String> copy3 = new ArrayList<String>();
        copy3.add("Peach");
        copy3.add("Orange");
        copy3.add("Pineapple");
        copy3.add(null);
        copy3.add("Again");
        Collections.copy(copy3, fruits);
        System.out.println("Copy3: " + copy3);

        // Using Java 8
        List<String> copy4 = fruits.stream()
                .collect(Collectors.toList());
        System.out.println("Copy4: " + copy4);

        // Using Java 9
        List<String> copy5 = List.of(fruits)
                .stream()
                .flatMap(a -> Arrays.stream(Arrays.copyOf(a.toArray(), a.toArray().length, String[].class)))
                .collect(Collectors.toList());
        copy5.add("Orange");
        System.out.println("Copy5: " + copy5);

        // Using Java 10
        //fruits.add(null);
        List<String> copy6 = List.copyOf(fruits);
        fruits.add("DDDDD");
        //copy6.add("Orange"); //throws unsupported operation exception
        System.out.println("Copy6: " + copy6);

        List<String> copy7 = Collections.unmodifiableList(fruits);
        fruits.add("Test");
        System.out.println("Copy7: " + copy7);
    }

}
