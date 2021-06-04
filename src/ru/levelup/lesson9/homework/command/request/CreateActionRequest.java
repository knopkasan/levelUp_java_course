package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class CreateActionRequest extends ActionRequest{
    String bankName;
    String accountType;
    double balance;
    String openDate;
    String closeDate;

    public CreateActionRequest(ActionType type, int accountNum, String bankName, String accountType,
                               double balance, String openDate, String closeDate) {
        super(type, accountNum);
        this.bankName = bankName;
        this.accountType = accountType;
        this.balance = balance;
        this.openDate = openDate;
        this.closeDate = closeDate;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountType() {
        return accountType;
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
}
