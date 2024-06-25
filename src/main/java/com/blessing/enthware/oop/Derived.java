package com.blessing.enthware.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Base {
    public <T extends CharSequence> Collection<T> transform(Collection<T> list) {
        return new ArrayList<T>();
    }
}

public class Derived extends Base {

    @Override
    public <T extends CharSequence> List<T> transform(Collection<T> list) {
        return new ArrayList<T>();
    }

    ;
}
