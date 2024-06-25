package com.blessing.advanceclassdesign.anonymousinnerclasses;

public class StatusReporter {
    static Shape.Color getDescriptiveColor(Shape.Color color) {
// note the use of anonymous inner classes here
// -- specifically, there is no name for the class and we construct
// and use the class "on the fly" in the return statement!
        return new Shape.Color() {
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
        };
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = getDescriptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}