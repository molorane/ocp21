package com.blessing.enthware.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveNULLElement {

    public static void main(String[] args) {
        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s); //1
        s1.add("b");
        s1.add(s);
        s1.remove(s); //2
        System.out.println(s1); //3
    }

}
