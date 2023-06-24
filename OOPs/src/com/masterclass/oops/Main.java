package com.masterclass.oops;

import com.masterclass.oops.dependecyInjection.CarDAO;
import com.masterclass.oops.dependecyInjection.CarService;
import com.masterclass.oops.dependecyInjection.EmailService;
import com.masterclass.oops.dependecyInjection.MOTService;
import com.masterclass.oops.encapsulation.BankAccount;
import com.masterclass.oops.extraction.EmailExtractorReport;
import com.masterclass.oops.extraction.NumberExtractorReport;
import com.masterclass.oops.inheritance.Animal;
import com.masterclass.oops.inheritance.Cat;
import com.masterclass.oops.inheritance.Dog;
import com.masterclass.oops.inheritance.Programmer;
import com.masterclass.oops.polymorphism.*;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        encapsulation();
//        inheritance();
//        abstractKey();
//        extractData();
        polymorphism();
    }

     public static void encapsulation() {
         BankAccount bankAccount = new BankAccount(
                 "XYZ",
                 TEN,
                 false
         );
         System.out.println(bankAccount.withdraw(new BigDecimal("9.0")));
         System.out.println(bankAccount.getBalance());
         System.out.println();
         System.out.println(bankAccount.withdraw(new BigDecimal("1.0")));
         System.out.println(bankAccount.getBalance());
         System.out.println();
         System.out.println(bankAccount.withdraw(new BigDecimal("9.0")));
         System.out.println(bankAccount.getBalance());
         bankAccount.setBalance(new BigDecimal("100.0")); //It is not correct because we are not following the rule of encapsulation
         System.out.println(bankAccount.getBalance());
     }

     public static void inheritance() {
        String[] languages = {"Angular", "Java", "Node.JS"};
         Programmer jamal = new Programmer("Jamal",
                 23,
                 "XYZ",
                 "FullStack",
                 languages);
         jamal.writeCode();
         System.out.println(jamal.getName());
         System.out.println(jamal.getAge());
         System.out.println(jamal.getAddress());
         System.out.println(jamal.getExperience());
         jamal.sayHello();
     }

     public static void abstractKey() {
         Animal dog = new Dog("Foo");
         Animal cat = new Cat("bar");
         dog.makeSound();
         cat.makeSound();
    }

    public static void extractData() throws FileNotFoundException {
        String path = "OOPs/src/data.txt";
        new NumberExtractorReport().parseAndSendReport(path);
        System.out.println();
        new EmailExtractorReport().parseAndSendReport(path);
    }

    public static void polymorphism() {
        //Polymorphism => Many Forms
        /*
        Car Bicycle Electric-Scooter Example
        - Car => move, break, getCurrentSpeed
        - Bicycle => move, break, getCurrentSpeed
        - ElectricScooter => move, break, getCurrentSpeed
        */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person john = new Person("John", vehicles);

        for (Vehicle vehicle : vehicles) {
            vehicle.move(10);
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();
        }

        System.out.println(Vehicle.PURCHASE_RATE);
        System.out.println(car.milesToKm());
    }

    public static void dependencyInjection() {
        //Dependency
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);

        //Injection
        CarService carService = new CarService(carDAO, emailService, motService);
    }
}