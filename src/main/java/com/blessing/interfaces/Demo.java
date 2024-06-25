package com.blessing.interfaces;


interface P {

    default Number p() {
        return 3;
    }
}

interface Q extends P {
    @Override
    abstract Integer p();
}

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
