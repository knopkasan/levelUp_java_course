package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.MenuService;
import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.text.SimpleDateFormat;
import java.util.Collection;

public class CloseAccountAction implements Action {
    private final AccountService accountService;

    public CloseAccountAction() {
        this.accountService = new PlainTextAccountService();
    }
    @Override
    public void doAction(MenuService menuService) {
        Collection<Account> accounts = accountService.LoadAccountList();
        int accountNum = accountService.ReceiveAccountNum();

        Account closedAcc = Account.lookingForAccount(accounts, accountNum);
        if (closedAcc != null && closedAcc.getCloseDate() == null) {
            closedAcc.setCloseDate(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                    .format(java.time.LocalDateTime.now()));
            System.out.printf("Счет %d закрыт.", accountNum);
        }
    }
}
