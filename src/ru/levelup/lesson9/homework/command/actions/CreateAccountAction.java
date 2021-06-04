package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.service.AccountService;

public class CreateAccountAction implements Action{

    private final AccountService accountService;
    private final String bankName;
    private final String accountType;
    private final int accountNum;
    private final double balance;
    private final String accountOpened;
    private final String accountClosed;

    public CreateAccountAction(AccountService accountService, String bankName,
                               String accountType, int accountNum, double balance,
                               String accountOpened, String accountClosed) {
        this.accountService = accountService;
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountOpened = accountOpened;
        this.accountClosed = accountClosed;
    }

    @Override
    public void doAction() {
        accountService.createAccount(bankName, accountType, accountNum, balance, accountOpened, accountClosed);
    }
}
