package com.blessing.enthware.collections;

public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        var fwa = new FunWithArgs();
        String[] ar = {"a", "b", "c"};
        String[][] newargs = {ar};
        fwa.main(newargs);
    }
}