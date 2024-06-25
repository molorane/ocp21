package com.blessing.localization.l2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("localization.l2.Cars");

        System.out.println(rb.getString("engine") + " " + rb.getString("love") + " " + rb.getString("okay"));
    }

}
