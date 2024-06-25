package com.blessing;

import java.util.ArrayList;
import java.util.List;

public class MathAPI {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double d = 9.8;
        System.err.println(Math.round(d));

        float f = 9.0f;
        System.err.println(Math.round(f));


        System.err.println(Math.pow(f, 2));

        List<?> li = new ArrayList<String>();
        li.add(null);
        Object o = li.get(0);
        System.err.println(o);
    }

}
