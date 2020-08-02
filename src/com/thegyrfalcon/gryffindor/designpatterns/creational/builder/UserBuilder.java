package com.thegyrfalcon.gryffindor.designpatterns.creational.builder;

public class UserBuilder {

    String name;
    int age;
    String address;
    String phone;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User build() {
        return new User(name, age, address, phone);
    }

}
