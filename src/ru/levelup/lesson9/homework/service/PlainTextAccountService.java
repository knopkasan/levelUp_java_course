package ru.levelup.lesson9.homework.service;

import ru.levelup.lesson9.homework.domain.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PlainTextAccountService implements AccountService {
    private static final String ACCOUNTS_FILE_PATH = "accounts.txt";

    @Override
    public Collection<Account> LoadAccountList() {
        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(ACCOUNTS_FILE_PATH))) {

            String line;
            Collection<Account> accounts = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                Account account = parseRawString(line);
                if (account != null) {
                    accounts.add(account);
                }
            }

            return accounts;
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла " + ACCOUNTS_FILE_PATH);
            return Collections.emptyList();
        }
    }

    @Override
    public Account createAccount(String bankName, String accountType, int accountNum) {
        try (BufferedWriter fileWriter =
                     new BufferedWriter(new FileWriter(ACCOUNTS_FILE_PATH, true))) {
            //ID%%NAME
            String line = bankName + "%%" + accountType + "%%" + accountNum;
            fileWriter.write(line);
            fileWriter.newLine();
            fileWriter.flush();

            return new Account(bankName, accountType, accountNum);
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл " + ACCOUNTS_FILE_PATH);
            return null;
        }
    }

    @Override
    public int ReceiveAccountNum() {
        return 0;
    }

    @Override
    public double ReceiveAccountBalance() {
        return 0;
    }

    private Account parseRawString(String rawAccountString) {
        //ID%%Name
        if (rawAccountString.trim().isEmpty()) {
            return null;
        }
        String[] elements = rawAccountString.split("%%");
        return new Account(elements[0],
                elements[1],
                Integer.parseInt(elements[2]));
    }
}
