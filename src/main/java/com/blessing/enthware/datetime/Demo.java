package com.blessing.enthware.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo {

    public static void main(String[] args) {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MMMMM/EEEEE");
        System.out.println(sdf.format(LocalDate.now()));

    }

}
