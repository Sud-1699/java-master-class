package com.demo;

import com.github.javafaker.Faker;

public class main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().city());
    }
}
