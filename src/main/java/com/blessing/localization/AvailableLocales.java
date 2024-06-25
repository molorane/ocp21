package com.blessing.localization;

import java.util.Arrays;
import java.util.Locale;


public class AvailableLocales {
    public static void main(String[] args) {
        System.out.println("The default locale is: " + Locale.getDefault());
        System.out.println("The default locale is: " + Locale.CANADA.toString());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.printf("All: %s %n", Locale.getDefault().toString());
        System.out.printf("No. of other available locales is: %d, and they are: %n", locales.length);
        Arrays.stream(locales)
                .forEach(locale -> System.out.printf("Locale code: %s and it stands for %s %n", locale,
                        locale.getDisplayName()));
    }
}