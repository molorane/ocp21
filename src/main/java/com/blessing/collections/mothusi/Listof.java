package com.blessing.collections.mothusi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listof {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Collection i = new ArrayList<>();
        List<Collection> list = List.of(i);
        i.add(9);
        i.add(8);
        System.err.println(list);
        //List<Integer> list2 = List.copyOf(list.);
        //System.err.println(list2);
    }

}
