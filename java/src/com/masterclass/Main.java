package com.masterclass;

public class Main {
    public static void main(String[] args) {
        //Single Line Comment
        /*
        * Multi line comment
        * */

        //Simple Print Message
        System.out.println("Hello Java 🎉");
        System.out.println(10 + 10);

        //primitives variables
        int number1 = 20;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);
        double pi = 3.14;
        boolean isPractice = true;
        char a = 'A';
        byte b = 127;
        short s = 32000;
        float f = 12.34f;

        //Numeric Literal with Underscore
        int billion = 1_000_000_008;
        System.out.println(billion);
        double d = 1_008.34;
        System.out.println(d);

        //Arithmetic Operators
        int n1 = 10;
        int n2 = 3;
        System.out.println(n1 + n2); //Result => 13
        System.out.println(n1 - n2); //Result => 7
        System.out.println(n1 * n2); //Result => 30
        System.out.println(n1 / n2); //Result => 3.333
        System.out.println(n1 % n2); //Result => 1
        //BODMAS RULE
        System.out.println((2 * 2) * (10/2) + 2); //Result => 22

        //Incremental & Decremental Operators
        //Post Incremental
        int i1 = 0;
        System.out.println(i1++);
        System.out.println(i1);
        //Pre
        int i2 = 0;
        System.out.println(++i2);
        System.out.println(i2);

        //Post Decremental
        int d1 = 0;
        System.out.println(d1--);
        System.out.println(d1);
        //Pre
        int d2 = 0;
        System.out.println(--d2);
        System.out.println(d2);

        //Comparison Operators
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

        boolean isJava = "Java" == "C++";
        System.out.println(isJava);

        //Short Hand Operators
        int o1 = 2;
        int o2 = 10;
        o2 += o1;
        System.out.println(o2);
    }
}