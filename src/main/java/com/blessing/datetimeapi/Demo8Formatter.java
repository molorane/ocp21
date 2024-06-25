package com.blessing.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Demo8Formatter {

    public static void main(String[] args) {
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("DD MMM yyyy");
        System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));

        LocalTime wakeupTime = LocalTime.of(6, 0);
        System.out.println("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));

        wakeupTime = LocalTime.of(6, 0);
        System.out.println("Wake up time: " + wakeupTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    }

}
