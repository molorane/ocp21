package com.blessing.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Base<M> {
    public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
        return new HashMap<T, Z>();
    }

    public <T> void p(List<? extends T> list) {

    }
}

@SuppressWarnings("rawtypes")
class Derived extends Base {
    // //1

    // @Override
    // public Map<Number, Number> getMap(Number t, Number z) { return new
    // TreeMap<Number, Number>(); }; //2

    @Override
    public Map<Number, Number> getMap(Number t, Number z) {
        return new HashMap<Number, Number>();
    }

    ; // 3
}

public class Demo<T> extends Base {


    public <X extends Number> void p() {

    }

    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List words = new ArrayList(21);
        words.add("2323");
    }

}

class StuckTurkeyCage implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        } catch (IOException | RuntimeException e) {
        }
    }
}
