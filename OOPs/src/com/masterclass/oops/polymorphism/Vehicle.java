package com.masterclass.oops.polymorphism;

public interface Vehicle {
    //Constants
    double PURCHASE_RATE = 0.5;

    //Abstract Methods
    void move(int amount);
    void applyBreak(int amount);
    int getCurrentSpeed();

    //Default Methods
    default double milesToKm() {
        return getCurrentSpeed() * 1.609;
    }
}
