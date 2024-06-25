package com.blessing.enthware.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class Base {

    public List<? super Integer> m() {
        return null;
    }

    public <T> Collection<T> transform(Collection<T> list) {
        return new ArrayList<T>();
    }
}

class Derived extends Base {

    @Override
    public ArrayList<? super Number> m() {
        return null;
    }

    @Override
    public <T> Collection<T> transform(Collection<T> list) {
        return new HashSet<T>();
    }

}

public class Demo {


    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.transform(new ArrayList<>());
    }
}
