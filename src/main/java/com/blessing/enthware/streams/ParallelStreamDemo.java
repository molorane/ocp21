package com.blessing.enthware.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P {
    String str = "a";
}

public class ParallelStreamDemo {

    static String str = "a";

    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a", "f", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a",
                "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");
        String join = vals.parallelStream().reduce("_", (a, b) -> a.concat(b));
        System.out.println(join);

        System.err.println(str == new P().str);

        p(new ArrayList<>());
    }

    @SafeVarargs
    static void p(List<Object>... is) {

    }

}
