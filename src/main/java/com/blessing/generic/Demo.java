package com.blessing.generic;

import java.util.ArrayDeque;

class Bbb {

}

interface Ccc {

}

interface Ddd {

}

class E<T extends Bbb & Ccc, Ddd> {

}

class Stats<T extends Number> {
    T num[];

    public Stats(T num[]) {
        this.num = num;
    }

    public double average() {
        double sum = 0;

        for (int i = 0; i < num.length; i++)
            sum += num[i].doubleValue();

        return sum / num.length;
    }

    public boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return num.toString();
    }
}

public class Demo<Demo> {

    public <X extends Number> X p() {
        return null;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offer(18);
        d.offer(5);
        d.push(13);
        System.out.println(d.poll() + " " + d.poll());
    }

}
