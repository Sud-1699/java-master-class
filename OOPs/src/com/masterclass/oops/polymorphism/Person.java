package com.masterclass.oops.polymorphism;

public class Person {
    private String name;
    private Vehicle[] vehicles;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}
