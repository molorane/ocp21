package com.blessing.localization.listresourcebundle;

import java.util.ListResourceBundle;

// default US English version
public class ResBundle_zu extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "Zulu on my stoop"},
            {"GrossRevenue", (Long) 2000L}, // in US dollars
            {"Year", (Integer) 1960}};
}