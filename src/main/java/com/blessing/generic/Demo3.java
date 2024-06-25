package com.blessing.generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        List<? extends IOException> li = new ArrayList<FileNotFoundException>();
        li.add(null);
    }


    public static <T> List<?> p(List<T> l) {
        return null;
    }

}
