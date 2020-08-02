package com.thegyrfalcon.gryffindor.designpatterns.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        User user = new UserBuilder()
                        .setName("Bob")
                        .setAge(25)
                        .build();

        System.out.println(user.toString());
    }

}
