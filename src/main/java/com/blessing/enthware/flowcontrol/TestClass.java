package com.blessing.enthware.flowcontrol;

import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;

public class TestClass {
    public static void main(String[] args) {
        var day = LocalDate.now().with(FRIDAY).getDayOfWeek();
        switch (day) {
            case MONDAY:
                TUESDAY:
                WEDNESDAY:
                THURSDAY:
                FRIDAY:
                System.out.println("working");
            case SATURDAY:
                SUNDAY:
                System.out.println("off");
        }
    }

    public static void p() {

    }
}