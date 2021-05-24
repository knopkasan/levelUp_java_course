package ru.levelup.lesson9.homework.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.UUID;

public class Account {

    private String bankName;
    private String accountType;
    private int accountNum;
    private double balance;
    private String openDate;
    private String closeDate;

    public Account(String bankName, String accountType, int accountNum) {
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountNum = accountNum;
        this.balance = 0.0;
        this.openDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                .format(Calendar.getInstance().getTime());
        closeDate = null;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getOpenDate() {
        return openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static Account lookingForAccount(Collection<Account> accounts, int accountNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                System.out.printf("Счет %d найден.", accountNum);
                return acc;
            }
        }
        return null;
    }
}
