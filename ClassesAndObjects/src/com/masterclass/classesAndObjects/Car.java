package com.masterclass.classesAndObjects;

import java.math.BigDecimal;

public class Car {
    private String name;
    private String color;
    private String model;
    private String type;
    private BigDecimal price;

    public Car() {
    }

    public Car(String name, String color, String model, String type, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.masterclass.classesAndObjects.Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
