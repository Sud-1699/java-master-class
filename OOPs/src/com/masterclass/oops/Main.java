package com.masterclass.oops;

import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;

public class Main {
    public static void main(String[] args) {
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
}