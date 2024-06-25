package com.blessing.datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo9 {

    public static void main(String[] args) {
        LocalDate babyDOB = LocalDate.of(2015, Month.FEBRUARY, 20);
        LocalDate now = LocalDate.of(2016, Month.APRIL, 10);
        System.out.println(Period.between(now, babyDOB).getYears()); // PERIOD_CALC

        ChronoUnit u = ChronoUnit.CENTURIES;
        System.out.println(u.getDuration().toDays() / 365);
    }

}
