package ru.levelup.lesson8;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        String accountId = bank.openAccount();
        System.out.println(accountId);

        Bank.initialAmount = 20.05;
        System.out.println(Bank.initialAmount);
    }
}
