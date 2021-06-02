package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import java.util.Collection;

public class DisplayAccountAction implements Action{
    private final AccountService accountService;
    private final int accountNum;

    public DisplayAccountAction(AccountService accountService, int accountNum) {
        this.accountService = accountService;
        this.accountNum = accountNum;
    }

    @Override
    public void doAction() {
        Collection<Account> accounts = accountService.loadAccountList();
        for (Account account : accounts) {
            System.out.println("Наименование банка: " + account.getBankName() + "\n" +
                    "Номер счета: " + account.getAccountNum() + "\n" +
                    "Тип счета: " +  account.getAccountType() + "\n" +
                    "Баланс: " + account.getBalance() + "\n" +
                    "Дата открытия: " + account.getOpenDate() + "\n" +
                    "Дата закрытия: " + account.getCloseDate() + "\n");
        }
    }
}
