package com.blessing.streams;

import java.util.Optional;
import java.util.stream.Stream;

class Animal implements Comparable<Animal> {

    String name;

    Animal(String n) {
        name = n;
    }

    @Override
    public int compareTo(Animal o1) {
        return this.getName().compareTo(o1.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class Okay {


    public static void main(String[] args) {
        Stream<Animal> list = Stream.of(
                new Animal("Nomfundo"),
                new Animal("Mothusi"),
                new Animal("Michael")
        );

        Optional<Animal> max = list.max(Animal::compareTo);

        max.ifPresent(System.out::println);

    }
}
