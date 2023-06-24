package com.masterclass.oops.polymorphism;

public class ElectricScooter implements Vehicle{
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Press Button");
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
