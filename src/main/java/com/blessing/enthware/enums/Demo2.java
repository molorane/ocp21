package com.blessing.enthware.enums;

import java.util.List;

public class Demo2 {

    enum Coffee {
        ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");

        public String strength;

        Coffee(String strength) {
            this.strength = strength;
        }

        public String toString() {
            return strength;
        }
    }

    public static void main(String[] args) {
        List.of(Coffee.values()).stream().forEach(e -> {
            System.out.print(e.name() + ":" + e + ", ");
        });
        List<Coffee> l = List.of(Coffee.values());
    }

}
