package com.blessing.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;


public class Demo7DaylightSaving {

    public static void main(String[] args) {
        ZoneId kolkataZone = ZoneId.of("Africa/Maseru");
        Duration kolkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Africa/Maseru zone DST is: %d hours %n", kolkataDST.toHours());
        ZoneId aucklandZone = ZoneId.of("Australia/Hobart");
        Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Australia/Hobart zone DST is: %d hours", aucklandDST.toHours());
    }

}
