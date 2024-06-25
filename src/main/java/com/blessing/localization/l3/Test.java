package com.blessing.localization.l3;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("localization.l3.Buggy");
        System.out.println(rb.getString("wheels"));
    }

}
