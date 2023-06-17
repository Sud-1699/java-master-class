package com.masterclass.oops;

import com.masterclass.oops.encapsulation.BankAccount;
import com.masterclass.oops.inheritance.Programmer;

import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;

public class Main {
    public static void main(String[] args) {
//        encapsulation();
        inheritance();
     }

     public static void encapsulation() {
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

     public static void inheritance() {
        String[] languages = {"Angular", "Java", "Node.JS"};
         Programmer jamal = new Programmer("Jamal",
                 23,
                 "XYZ",
                 "FullStack",
                 languages);
         jamal.writeCode();
         System.out.println(jamal.getName());
         System.out.println(jamal.getAge());
         System.out.println(jamal.getAddress());
         System.out.println(jamal.getExperience());
         jamal.sayHello();
     }
}