package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.domain.Account;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CloseAccountAction implements Action {
    private final AccountService accountService;
    private final int accountNum;
    private final DateTimeFormatter formatter;

    public CloseAccountAction(AccountService accountService,
                              int accountNum) {
        this.accountService = accountService;
        this.accountNum = accountNum;
        this.formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    }

    @Override
    public void doAction() {
        ArrayList<Account> accounts = accountService.loadAccountList();
        boolean isFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if ( accounts.get(i).getAccountNum() == accountNum
                    && accounts.get(i).getCloseDate().equals("null") ) {
                accounts.get(i).setCloseDate(LocalDate.now().format(formatter));
                System.out.printf("Счет %d закрыт.\n", accountNum);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Счет не найден.");
        }
        accountService.updateAccount(accounts);
    }
}
