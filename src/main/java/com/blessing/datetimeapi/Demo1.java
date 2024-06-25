package com.blessing.datetimeapi;

import java.time.*;

public class Demo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate valentinesDay = LocalDate.of(2016, Month.FEBRUARY, 14);
        System.out.println(LocalDate.now(ZoneId.of("Asia/Kolkata")));

        Duration duration = Duration.ofDays(1);
        Period period = Period.ofDays(1);
        System.out.println(duration.toString() + "," + period.toString());
    }

}
