package com.blessing.enthware.flowcontrol;


public class ForSwitch {


    @Deprecated
    public ForSwitch() {
    }

    public static void main(String[] args) {
        int i1 = 12345678;
        float f = i1;
        System.err.println(i1 - (int) f);
    }

}

class P extends ForSwitch {


}
