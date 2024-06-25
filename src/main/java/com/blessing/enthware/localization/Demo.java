package com.blessing.enthware.localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy MMMMM d");
        System.out.println(localDate.format(df));

    }

}
