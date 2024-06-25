package com.blessing.datetimeapi;

import java.time.*;

public class Demo6 {

    public static void main(String[] args) {
        p();
    }

    public static void p() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime, myZone);
        System.out.println(zonedDateTime.plusHours(3));


        LocalDateTime dateTime = LocalDateTime.now();
        zonedDateTime = dateTime.atZone(myZone);

        System.out.println(zonedDateTime);
        p1();
    }

    public static void p1() {
        ZoneId myZone = ZoneId.systemDefault();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset);
    }

}
