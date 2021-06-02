package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class CreateActionRequest extends ActionRequest{
    String bankName;
    String accountType;

    public CreateActionRequest(ActionType type, int accountNum, String bankName, String accountType) {
        super(type, accountNum);
        this.bankName = bankName;
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountType() {
        return accountType;
    }
}
