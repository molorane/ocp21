package com.blessing.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {

    public static void selectHighestTemperature(Stream<Double> temperatures) {
        System.out.println(temperatures.max(Double::compareTo));
    }

    public static void main(String[] args) {
        selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
        selectHighestTemperature(Stream.of());

        Optional<String> nullableStr = Optional.ofNullable(null);
        System.out.println(nullableStr);
    }

}
