package com.blessing.localization.practice;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

    public static void main(String[] args) {
        Locale currentLocale = new Locale("fr", "CA");
        ResourceBundle resBundle = ResourceBundle.getBundle("localization.practice.ResourceBundle", Locale.getDefault());
        ResourceBundle resBundle1 = ResourceBundle.getBundle("localization.practice.ResourceBundle", currentLocale);
        System.out.printf(resBundle.getString("Greeting"));
        System.out.printf(resBundle1.getString("Greeting"));
    }

}
