package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.service.AccountService;

public class CreateAccountAction implements Action{

    private final AccountService accountService;
    private final String bankName;
    private final String accountType;
    private final int accountNum;

    public CreateAccountAction(AccountService accountService, String bankName, String accountType, int accountNum) {
        this.accountService = accountService;
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountNum = accountNum;
    }

    @Override
    public void doAction() {
        accountService.createAccount(bankName, accountType, accountNum);
    }
}
