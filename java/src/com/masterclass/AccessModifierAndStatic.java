package com.masterclass;

public class AccessModifierAndStatic {
    //Access Modifies and Static Keyword
    //Static mean method or attributes belong to class
    public static String name;
    public String name1;

    public static void main(String[] args) {
        name = "xyz";
        //name1 = "Not able to access name1 within static method";

        //In Order to access non static attributes need to create instance of class
        AccessModifierAndStatic aStatic = new AccessModifierAndStatic();
        aStatic.name1 = "Now able to access";
    }
}
