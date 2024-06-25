package com.blessing.localization.listresourcebundle;

import java.util.ListResourceBundle;

// default US English version
public class ResBundle_en_CA extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "BlackPanther"},
            {"GrossRevenue", (Long) 1991L}, // in US dollars
            {"Year", (Integer) 1988}};
}