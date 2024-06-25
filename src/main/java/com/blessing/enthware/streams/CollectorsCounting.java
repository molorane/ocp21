package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsCounting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("charles", "chuk", "cynthia", "cho", "cici");
        Long x = names.stream().filter(name -> name.length() > 4).collect(Collectors.counting());
        System.out.println(x);
    }

}
