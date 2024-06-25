package com.blessing.advanceclassdesign.localinnerclasses;


class StatusReporter {
    // important to note that the argument "color" is declared final
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
// local class DescriptiveColor that extends Shape.Color class
        int a;
        class DescriptiveColor extends Shape.Color {
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
        }
        return new DescriptiveColor();
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = getDescriptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}