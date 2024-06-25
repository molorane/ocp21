package com.blessing.enthware.optional;

import java.util.Optional;

public class TestClass {

    public static void main(String[] args) {

        // Optional<Double> price = Optional.of(getPrice("1111"));
        Optional<Double> price = Optional.ofNullable(getPrice("1111"));
        Double x = price.orElse(getPrice("2222"));

        Optional<Double> price1 = Optional.ofNullable(getPrice("1111"));
        Double y = price1.orElseGet(() -> getPrice("333"));

        price.orElseThrow();
    }

    static Double getPrice(String st) {
        return null;
    }

}
