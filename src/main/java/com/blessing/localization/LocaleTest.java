package com.blessing.localization;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("nom", "ma", "mil"); // #1
        System.out.println(locale.toString());
    }
}