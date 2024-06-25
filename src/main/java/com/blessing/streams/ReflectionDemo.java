package com.blessing.streams;

import java.lang.reflect.Field;

class P {
    private int shoki = 19;

    public void setShoki(int f) {
        shoki = f;
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

        P s = new P();
        s.setShoki(200);

        Class<? extends P> p = new P().getClass();
        Field f = p.getDeclaredField("shoki");
        f.setAccessible(true);
        System.out.println("Shoki is " + f.getInt(s));
        System.out.println(f.getType());

    }

}
