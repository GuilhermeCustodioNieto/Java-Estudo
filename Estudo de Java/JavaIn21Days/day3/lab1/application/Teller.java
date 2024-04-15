package com.day3.lab1.application;

import com.day3.lab1.entities.Account;

public class Teller {
    public static void main(String[] args) {
        Account account1 = new Account(255);
        account1.depositFunds(255);
        System.out.println(account1.getBalance());

        Account account2 = new Account(1800);
        System.out.println(account2.withdrawFunds(1900));

        Account account3 = new Account(800);
        System.out.println(account3.withdrawFunds(200));
    }
}
