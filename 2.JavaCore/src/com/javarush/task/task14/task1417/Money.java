package com.javarush.task.task14.task1417;

public abstract class Money {
    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount=amount;
    }
     private double amount;

    public String getCurrencyName() {
        return null;
    }
}

