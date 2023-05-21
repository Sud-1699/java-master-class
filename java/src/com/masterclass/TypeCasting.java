package com.masterclass;

public class TypeCasting {
    public static void main(String[] args) {
        //Type Casting
        //Implicit Type (Widening) Casting
        System.out.println("Implicit Type (Widening) Casting");
        int balance = 100;
        double balanceToDouble = balance;
        System.out.println(balance);
        System.out.println(balanceToDouble);

        //Explicit Type (Narrowing) Casting
        System.out.println("Explicit Type (Narrowing) Casting");
        double remainingBalance = 100.55;
        int remainingBalanceToInt = (int) remainingBalance;
        System.out.println(remainingBalance);
        System.out.println(remainingBalanceToInt);
    }
}
