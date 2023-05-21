package com.masterclass;

import java.util.Arrays;

public class Enums {
    //Declare enum within class or create enum file
    enum Gender {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {
        //Enum within class
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);

        //Enum with enum file
        System.out.println(Color.RED);
        System.out.println(Color.BLACK);

        //Color are the data type of color enum
        Color red = Color.RED;
        System.out.println(red);

        //Enum method
        System.out.println(Color.valueOf("WHITE"));
        System.out.println(Arrays.toString(Color.values())); //Give all the values of enum

        for(Color color: Color.values()) {
            System.out.println(color);
        }
    }
}
