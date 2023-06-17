package com.masterclass.oops.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woff Woff");
    }
}
