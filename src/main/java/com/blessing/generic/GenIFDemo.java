package com.blessing.generic;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    public MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        }

        return v;
    }

    @Override
    public T max() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        }

        return v;
    }

}

public class GenIFDemo {

    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max in inums: " + iob.max());
        System.out.println("Min in inums: " + iob.min());

        System.out.println("Max in cob: " + cob.max());
        System.out.println("Min in cob: " + cob.min());

    }

}
