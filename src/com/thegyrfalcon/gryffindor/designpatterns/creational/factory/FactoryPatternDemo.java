package com.thegyrfalcon.gryffindor.designpatterns.creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape("Square");
        square.draw();

        Shape triangle = factory.getShape("Triangle");
        triangle.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();

    }

}
