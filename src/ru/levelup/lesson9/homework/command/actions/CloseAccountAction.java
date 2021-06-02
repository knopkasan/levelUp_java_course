package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CloseAccountAction implements Action {
    private final AccountService accountService;
    private final int accountNum;

    public CloseAccountAction(AccountService accountService,
                              int accountNum) {
        this.accountService = accountService;
        this.accountNum = accountNum;
    }

    @Override
    public void doAction() {
        ArrayList<Account> accounts = accountService.loadAccountList();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNum() == accountNum
                    && accounts.get(i).getCloseDate() == null) {
                accounts.get(i).setCloseDate(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                        .format(java.time.LocalDateTime.now()));
                System.out.printf("Счет %s закрыт.", accountNum);
                break;
            }
            System.out.println("Счет не найден или уже закрыт");
        }
    }
}
