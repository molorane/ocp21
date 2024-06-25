package com.blessing.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo4 {

    public static void main(String[] args) {
        p();
    }

    public static void p() {
        LocalDateTime comingMidnight =
                LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(now, comingMidnight);
        System.out.println(between);
    }

    public static void p1() {
        LocalTime comingMidnight = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.now();
        Duration between = Duration.between(now, comingMidnight);
        System.out.println(between);
    }

}
