package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.MenuService;
import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.ConsoleInputAccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.util.Collection;

import static ru.levelup.lesson9.homework.domain.Account.lookingForAccount;

public class UpdateAccountAction implements Action{

    private final AccountService accountService;
    private final AccountService inputService;

    public UpdateAccountAction() {
        this.accountService = new PlainTextAccountService();
        this.inputService = new ConsoleInputAccountService();
    }
    @Override
    public void doAction(MenuService consoleMenuService) {
        Collection<Account> accounts = accountService.LoadAccountList();
        int accountNum = inputService.ReceiveAccountNum();
        double balance = inputService.ReceiveAccountBalance();

        Account acc = lookingForAccount(accounts, accountNum);
        if (acc != null) {
            acc.setBalance(balance);
            System.out.printf("Баланс счета %d обновлен.", accountNum);
        }
    }
}
