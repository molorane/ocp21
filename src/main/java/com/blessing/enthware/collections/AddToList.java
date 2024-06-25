package com.blessing.enthware.collections;

import java.util.ArrayList;
import java.util.List;

public class AddToList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("val0"); //0
        list.add("val1"); //1
        list.add(2, "val2"); //2
        list.add(1, "val3"); //3
        System.out.println(list);
    }

}
