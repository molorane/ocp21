package com.blessing.localization;

import java.util.Arrays;
import java.util.Locale;

public class AvailableLocalesEnglish {
    public static void main(String[] args) {
        Arrays.stream(Locale.getAvailableLocales()).filter(locale -> locale.getLanguage().equals("en"))
                .forEach(locale -> System.out.printf("Locale code: %s and it stands for %s %n", locale,
                        locale.getDisplayName()));
    }
}