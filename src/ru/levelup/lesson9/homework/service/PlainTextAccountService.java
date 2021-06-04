package ru.levelup.lesson9.homework.service;

import ru.levelup.lesson9.homework.domain.Account;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class PlainTextAccountService implements AccountService {
    private static final String ACCOUNTS_FILE_PATH = "accounts.txt";

    @Override
    public ArrayList<Account> loadAccountList() {
        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(ACCOUNTS_FILE_PATH))) {

            String line;
            ArrayList<Account> accounts = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                Account account = parseRawString(line);
                if (account != null) {
                    accounts.add(account);
                }
            }

            return accounts;
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла " + ACCOUNTS_FILE_PATH);
            return new ArrayList<>();
        }
    }

    @Override
    public Account createAccount(String bankName, String accountType, int accountNum,
                                 double balance, String accountOpened, String accountClosed) {
        Account acc = new Account(bankName, accountType, accountNum, balance, accountOpened, accountClosed);
        try (BufferedWriter fileWriter =
                     new BufferedWriter(new FileWriter(ACCOUNTS_FILE_PATH, true))) {
            //ID%%NAME
            String line = acc.getBankName() + "%%" + acc.getAccountType() + "%%" + acc.getAccountNum() +
            "%%" + acc.getBalance() + "%%" + acc.getOpenDate() + "%%" + acc.getCloseDate();
            fileWriter.write(line);
            fileWriter.newLine();
            fileWriter.flush();

            return acc;
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл " + ACCOUNTS_FILE_PATH);
            return null;
        }
    }

    @Override
    public ArrayList<Account> updateAccount(ArrayList<Account> accounts) {
        try (BufferedWriter fileWriter =
                     new BufferedWriter(new FileWriter(ACCOUNTS_FILE_PATH, false))) {
            for ( Account a : accounts ) {
                String line = a.getBankName() + "%%" + a.getAccountType() + "%%" + a.getAccountNum() +
                        "%%" + a.getBalance() + "%%" + a.getOpenDate() + "%%" + a.getCloseDate();
                fileWriter.write(line);
                fileWriter.newLine();
            }
            fileWriter.flush();

            return accounts;
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл " + ACCOUNTS_FILE_PATH);
            return null;
        }
    }

    private Account parseRawString(String rawAccountString) {
        //ID%%Name
        if (rawAccountString.trim().isEmpty()) {
            return null;
        }
        String[] elements = rawAccountString.split("%%");
        return new Account(elements[0],
                elements[1],
                Integer.parseInt(elements[2]), Double.parseDouble(elements[3]), elements[4], elements[5]);
    }
}
