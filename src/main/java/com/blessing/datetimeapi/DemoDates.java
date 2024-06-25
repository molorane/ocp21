package com.blessing.datetimeapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.BlockingQueue;
import java.util.function.Predicate;


public class DemoDates {

    private String name;

    public DemoDates(String n) {
        name = n;
    }

    public static void main(String[] args) throws InterruptedException {
        int a = 0xAE;
        System.out.println(a);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Java is cool.");
    }

    public static void q8() {
        LocalDate localDate = LocalDate.of(2015, 4, 4);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }
}
