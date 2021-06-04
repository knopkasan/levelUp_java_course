package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;

import java.util.ArrayList;

public class UpdateAccountAction implements Action{

    private final AccountService accountService;
    private final int accountNum;
    private final double balance;

    public UpdateAccountAction(AccountService accountService, int accountNum, double balance) {
        this.accountService = accountService;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    @Override
    public void doAction() {
        ArrayList<Account> accounts = accountService.loadAccountList();
        boolean isFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNum() == accountNum
                    && accounts.get(i).getCloseDate().equals("null")) {
                accounts.get(i).setBalance(balance);
                System.out.printf("Баланс счета %d обновлен.\n", accountNum);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Счет не найден или закрыт.");
        }
        accountService.updateAccount(accounts);
    }
}
