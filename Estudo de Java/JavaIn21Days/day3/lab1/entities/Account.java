package com.day3.lab1.entities;

public class Account {
    private Double balance;

    public Account() {
        balance = 0.00;
    }

    public Account(double initialDeposit){
        balance = initialDeposit;
    }

    public Double getBalance() {
        return balance;
    }

    public void depositFunds(double funds) {
        balance += funds;
    }

    public double withdrawFunds(double funds) {
        if(funds >= balance){
            funds = balance;
        }

        balance -= funds;
        return funds;
    }
}
