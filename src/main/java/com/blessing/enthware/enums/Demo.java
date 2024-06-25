package com.blessing.enthware.enums;

enum Coffee {
    ESPRESSO("Very Strong") {
        @Override
        public void p() {
            // TODO Auto-generated method stub

        }
    }, MOCHA("Bold") {
        @Override
        public void p() {
            // TODO Auto-generated method stub

        }
    }, LATTE("Mild") {
        @Override
        public void p() {
            // TODO Auto-generated method stub

        }
    };

    public String strength;
    static int i = 9;

    public void p() {
    }

    ;

    Coffee(String strength) {
        this.strength = strength;
    }

    public String toString() {
        //return String.valueOf(Coffee.ESPRESSO); // stackoverflow
        return String.valueOf(strength);
    }
}

public class Demo {

    public static void main(String[] args) {
        System.out.println(Coffee.ESPRESSO.toString());
    }

}
