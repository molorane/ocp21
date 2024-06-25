package com.blessing.generic;

/**
 * @author Mothusi Molorane
 */
class GenCons {

    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    static <T extends Comparable<T>, V extends T> boolean exist(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i]))
                return true;
        return false;
    }

    void showval() {
        System.out.println("val: " + val);
    }
}

public class GenConsDemo {

    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.7);
        test.showval();
        test2.showval();
    }

}
