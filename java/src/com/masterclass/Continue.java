package com.masterclass;

public class Continue {
    public static void main(String[] args) {
        String[] names = new String[] {
                "Arun",
                "Sam",
                "Ganesh",
                "Nidhi",
                "Amit"
        };

        for(String name: names) {
            if(name.startsWith("A")) {
                continue;
            }
            System.out.println("Name :" + name);
        }
    }
}
