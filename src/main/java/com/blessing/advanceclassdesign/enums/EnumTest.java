package com.blessing.advanceclassdesign.enums;

enum Gender {
    MALE(11),
    FEMALE(12);

    Gender(int a) {

    }
}

public class EnumTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Gender.MALE.name());
        System.out.println(Gender.MALE.ordinal());
    }

}
