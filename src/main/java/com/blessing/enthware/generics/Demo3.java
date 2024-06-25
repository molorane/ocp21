package com.blessing.enthware.generics;

import java.util.ArrayList;
import java.util.List;

class Base1 {
    public <T> List<T> transform(List<T> list) {
        return new ArrayList<T>();
    }
}

class Derived1 extends Base1 {

    @Override
    public <T> ArrayList<T> transform(List<T> list) {
        return new ArrayList<T>();
    }

    ;

}

public class Demo3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<? super Number> li = null;
        li.add(6.9);
        Object n = li.get(0);
    }

}
