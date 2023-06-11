package com.masterclass.oops;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.ZERO;

public class BankAccount {
    //Working with encapsulation
    //process of binding an object state and behaviour together into one unit
    //State or Property or Attributes
    private String name;
    private BigDecimal balance; //thru encapsulation we can hide state
    private boolean hasOverDraft;

    public BankAccount() {
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = ZERO;
        this.hasOverDraft = false;
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverDraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverDraft = hasOverDraft;
    }

    //Behaviour
    public BigDecimal withdraw(BigDecimal amount) {
        if(balance.subtract(amount).compareTo(ZERO) >= 0) {
            this.balance = balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }

    //TO solve problem of non-private fields
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasOverDraft() {
        return hasOverDraft;
    }

    public void setHasOverDraft(boolean hasOverDraft) {
        this.hasOverDraft = hasOverDraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return hasOverDraft == that.hasOverDraft && Objects.equals(name, that.name) && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasOverDraft);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", hasOverDraft=" + hasOverDraft +
                '}';
    }
}
