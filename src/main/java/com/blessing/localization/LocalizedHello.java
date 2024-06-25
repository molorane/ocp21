package com.blessing.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

    public static void main(String[] args) {
        Locale currentLocale = new Locale("zu");
        // OR Locale currentLocale = Locale.forLanguageTag("zu");
        Locale.setDefault(currentLocale);
        ResourceBundle resBundle =
                ResourceBundle.getBundle("localization.ResourceBundle", Locale.getDefault());
        System.out.println(resBundle.getClass());
        System.out.printf(resBundle.getString("Currency"));
    }

}
