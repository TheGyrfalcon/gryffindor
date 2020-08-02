package com.thegyrfalcon.gryffindor.designpatterns.creational.builder;

public class User {

    String name;
    int age;
    String address;
    String phone;

    public User(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
