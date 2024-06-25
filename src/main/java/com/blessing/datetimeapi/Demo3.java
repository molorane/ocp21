package com.blessing.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo3 {

    public static void main(String[] args) {
        Duration d = Duration.of(90, ChronoUnit.HOURS);
        System.out.println(d);
        p();
    }

    public static void p() {
        // prints the current timestamp with UTC as time zone
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timestamp is: " + currTimeStamp);
        // prints the number of seconds as Unix timestamp from epoch time
        System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());
        // prints the Unix timestamp in milliseconds
        System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());
    }

    public static void p1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println("LocalDateTime is: " + localDateTime + " \nInstant is: " + instant);
    }


    public static void p2() {
        Instant i1 = Instant.now().minus(9, ChronoUnit.HOURS);
        System.out.println(i1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {

        }

        Instant i2 = Instant.now();
        System.out.println(i2);
        Duration p = Duration.between(i1, i2);

        System.out.println(p);
    }


}
