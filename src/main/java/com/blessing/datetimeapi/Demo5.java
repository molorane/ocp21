package com.blessing.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class Demo5 {

    public static void main(String[] args) {
        System.out.println("My zone id is: " + ZoneId.systemDefault());

        ZoneId zone = ZoneId.of("America/Managua");

        System.out.println(LocalDateTime.now(zone));
        //p();
    }

    public static void p() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println("Number of available time zones is: " + zones.size());
        zones.forEach(System.out::println);
    }

}
