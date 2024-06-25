package com.blessing.enumtypes;

enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPrintPageCapacity() {
        return pagePrintCapacity;
    }
}