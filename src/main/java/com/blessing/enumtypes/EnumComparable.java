package com.blessing.enumtypes;

import java.util.TreeSet;

enum Title {
    MR("Mr."), MS("Ms."), Dr("Ms.");

    private String title;

    private Title(String s) {
        title = s;
    }
}

public class EnumComparable {

    public static void main(String[] args) {
        var ts = new TreeSet<Title>();
        ts.add(Title.Dr);
        ts.add(Title.MR);
        ts.add(Title.MS);
        for (Title t : ts) {
            System.out.println(t);
        }
    }

}
