package com.blessing.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<? extends IOException> ex = new ArrayList<IOException>();
        ex.add(null);
        m(ex);
    }

    static <T> T m(List<? extends T> list) {
        return null;
    }

}
