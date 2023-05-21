package com.masterclass;

public class Wrapper {

    public static void main(String[] args) {
        //Wrapper Classes

      /*
        byte -> Byte
        int -> Integer
        double -> Double
        float -> Float
        boolean -> Boolean
        char -> Character
        long -> Long
        short -> Short
        */

        Integer age = 20;
        System.out.println(age.toString());

        Double price = 206.55;

        String ageStr = "24";
        int newAge = Integer.parseInt(ageStr);
        System.out.println(newAge);

        System.out.println(Integer.min(-1, 5));
    }
}
