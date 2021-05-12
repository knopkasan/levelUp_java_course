package ru.levelup.lesson8;

import java.util.Map;
import java.util.UUID;

public class Bank {

    static double initialAmount = 10.0;

    //String - accountId
    //Double - amount
    private Map<String, Double> accounts;

    public String openAccount() {
        String accountId = UUID.randomUUID().toString();
        accounts.put(accountId, 0.0);

        return accountId;
    }

    //статический метод может работать только со статическими методами и полями (напрямую)
    //можно обращаться только через объект
    public static void changeInitialAmount(double amount) {
        if (amount >= 0) {
            initialAmount = amount;
            //Bank b = new Bank();
            //b.accounts = new HashMap<>();
        }
    }
}
