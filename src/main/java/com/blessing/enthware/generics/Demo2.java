package com.blessing.enthware.generics;

import java.util.List;

public class Demo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<? super Number> li = null;
        li.add(6.9);
        Object n = li.get(0);
    }

}
