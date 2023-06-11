package com.masterclass.classesAndObjects;

public class Main {
    public static void main(String[] args) {
        //Working With Classes
        Cat maria = new Cat("Maria", 2, "Star White");
//        maria.setName("Maria");
        maria.meow();
        System.out.println(maria.getName());
        System.out.println(maria.getAge());
        System.out.println("String representation of object");
        System.out.println(maria);
        System.out.println();
        Cat rose = new Cat();
        rose.setName("Rose");
        rose.meow();
        System.out.println(rose.getName());
        System.out.println("String representation of object");
        System.out.println(rose);
        System.out.println();
        Cat mar = new Cat("Mar");
        mar.meow();
        System.out.println(mar.getName());
        System.out.println(mar.getAge());
        System.out.println("String representation of object");
        System.out.println(mar);
        System.out.println();
        System.out.println("Comparing Objects");
        Cat maria1 = new Cat("Maria", 2, "Star White");
        Cat maria2 = new Cat("Maria", 2, "Star White");
        System.out.println("using == sign");
        System.out.println(maria1 == maria2);
        System.out.println("using .equals() method");
        System.out.println(maria1.equals(maria2));
    }

}