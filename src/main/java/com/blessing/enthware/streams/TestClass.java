package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;

class MyProcessor {
    Integer value;

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }

    public Integer inc() {
        return value;
    }
}

public class TestClass {
    public static void main(String[] args) {

        args[0] = "";
        List<Integer> ls = Arrays.asList(1, 2, 3);

        ls.stream()
                .map(MyProcessor::new)
                //.map(MyProcessor::inc)
                .forEach(MyProcessor::process);
    }
}