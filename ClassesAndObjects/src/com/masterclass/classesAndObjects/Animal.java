package com.masterclass.classesAndObjects;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private String color;
    private String bread;

    public Animal(String name, int age, String color, String bread) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.bread = bread;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "com.masterclass.classesAndObjects.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(bread, animal.bread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, bread);
    }
}
