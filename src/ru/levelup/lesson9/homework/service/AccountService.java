package ru.levelup.lesson9.homework.service;

import ru.levelup.lesson9.homework.domain.Account;

import java.util.ArrayList;

public interface AccountService {

    ArrayList<Account> loadAccountList();

    Account createAccount(String bankName, String accountType, int accountNum);

    ArrayList<Account> updateAccount(ArrayList<Account> accounts);

}
