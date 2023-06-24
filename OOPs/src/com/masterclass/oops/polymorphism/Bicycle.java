package com.masterclass.oops.polymorphism;

public class Bicycle implements Vehicle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Pedal");
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreak(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
