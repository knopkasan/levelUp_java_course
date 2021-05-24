package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.MenuService;
import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.util.Collection;

public class DisplayAccountAction implements Action{
    private final AccountService accountService;

    public DisplayAccountAction() {
        this.accountService = new PlainTextAccountService();
    }
    @Override
    public void doAction(MenuService menuService) {
        //отображение списка факультетов
        //1. получить список
        //2. отобразить список
        Collection<Account> accounts = accountService.LoadAccountList();
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
