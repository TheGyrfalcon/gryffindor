package com.thegyrfalcon.gryffindor.designpatterns.creational.factory;

public class ShapeFactory {

    private static String SQUARE = "Square";

    private static String TRIANGLE = "Triangle";

    private static String RECTANGLE = "Rectangle";

    public Shape getShape(String shape) {

        if(SQUARE.equalsIgnoreCase(shape)) {
            return new Square();
        }

        if(TRIANGLE.equalsIgnoreCase(shape)) {
            return new Triangle();
        }

        if(RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        }

        return null;

    }

}
