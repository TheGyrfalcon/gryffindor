package com.thegyrfalcon.gryffindor.designpatterns.creational.factory;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("[Triangle.draw] => Drawing Triangle");
    }

}
