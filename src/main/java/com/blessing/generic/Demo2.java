package com.blessing.generic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

class C {

    public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
        return new HashMap<T, Z>();
    }
}

public class Demo2 extends C {

    AtomicInteger i;

    @Override
    public Map<Integer, Integer> getMap(Number t, Number z) {
        return new HashMap<Integer, Integer>();
    }

    public static void En(Object o) {
        System.out.println(o.getClass());
    }

    public <P extends Number> void k() {

    }

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        Function<List<String>, List<String>> f = li -> li.subList(1, 2);

        List<String> v = f.apply(list);
        v.add("three");

        System.err.println(v);

        list.forEach(Demo2::En);
    }

}
