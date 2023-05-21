package com.masterclass;

public class Strings {
    public static void main(String[] args) {
        //Strings
        String name = "Xyz";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("    ".isEmpty());
        System.out.println("  Hello   ".trim());
        System.out.println(name.startsWith("X"));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 2));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name + " Abc");

        //Comparing String and String Literal and String Object
        String name1 = "Jamila";
        String name2 = "Jamila";
//        name2 = "Alex";
        String name3 = new String("Jamila");

        //Using == will compare reference instead of values
        System.out.println("String equality check with ==");
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        //Using equals() will compare values
        System.out.println("String equality check with equals()");
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        //Useful String Method
        String number = String.valueOf(1);
        System.out.println(number);
        String format = String.format("Number %s", number);
        System.out.println(format);
        String[] names = {"ABC", "XYZ", "DES"};
        String join = String.join(", ", names);
        System.out.println(join);
    }
}
