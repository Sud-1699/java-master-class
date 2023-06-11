package com.masterclass.classesAndObjects;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    //working with static
    public static int count;
    static {
        System.out.println("Start: static initialization");
        count = 0;
        System.out.println("End: static initialization");
    }

    private String firstName;
    private String lastName;
    private Gender gender;
    private Animal[] animals;
    private Address address;
    private Car[] cars;

    //Working with instance initializer
    {
        System.out.println("Instance Initializer");
        count++;
    }

    public Person() {
        System.out.println("Default Constructor");
    }

    public Person(String firstName, String lastName, Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public Person(String firstName, String lastName, Gender gender, Animal[] animals, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.animals = animals;
        this.address = address;
    }

    public Person(String firstName, String lastName, Gender gender, Address address, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.cars = cars;
    }

    public Person(String firstName, String lastName, Gender gender, Animal[] animals, Address address, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.animals = animals;
        this.address = address;
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "com.masterclass.classesAndObjects.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", animals=" + Arrays.toString(animals) +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Arrays.equals(animals, person.animals) && Objects.equals(address, person.address) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender, address);
        result = 31 * result + Arrays.hashCode(animals);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}
