package com.blessing.streams;

import java.util.List;

public class Question {

    public static void main(String[] args) {
        var lst = List.of(1, 2, 3, 4);
        lst.replaceAll(x -> x + 100);
        System.out.println("-Completed-");
    }

}
