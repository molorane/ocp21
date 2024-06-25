package com.blessing.datetimeapi;

import java.time.Instant;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Demo2 {

    public static void main(String[] args) {
        Month m = Month.APRIL;
        // TODO Auto-generated method stub
        LocalTime currTime = LocalTime.now();
        System.out.println("Current time is: " + currTime);
        System.out.println(LocalTime.of(18, 30));

        long hours = 6;
        long minutes = 52;
        currTime = LocalTime.now();
        System.out.println("Current time is: " + currTime);
        System.out.println("My meeting is at: " + currTime.plusMinutes(minutes).plusHours(hours));
        System.out.println("Of seconds: " + LocalTime.ofSecondOfDay(60));
        System.out.println(Instant.now());
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("Holiday: yyyy dd MMM");
    }

}
