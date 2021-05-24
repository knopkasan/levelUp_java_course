package ru.levelup.lesson9.homework.service;

import ru.levelup.lesson9.homework.domain.Account;

import java.util.Collection;

public interface AccountService {
    Collection<Account> LoadAccountList();

    Account createAccount(String bankName, String accountType, int accountNum);

    int ReceiveAccountNum();

    double ReceiveAccountBalance();
}
