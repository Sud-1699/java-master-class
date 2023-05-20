package com.masterclass;

public class Break {
    public static final String NAME = "XYZ"; //Constants with final keyword
    public static void main(String[] args) {
        int[] numbers = new int[] {
                1,
                2,
                3,
                4,
                5
        };

        for(int number: numbers) {
            if(number == 4) {
                break;
            }
            System.out.println("Number: " + number);
        }
    }
}

