package ru.levelup.lesson9.homework.command.actions;

import ru.levelup.lesson9.homework.MenuService;
import ru.levelup.lesson9.homework.service.AccountService;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateAccountAction implements Action{

    private final AccountService accountService;

    public CreateAccountAction() {this.accountService = new PlainTextAccountService();
    }

    @Override
    public void doAction(MenuService consoleMenuService) {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите название банка");
            String bankName = reader.readLine();
            System.out.println("Введите тип счета");
            String accountType = reader.readLine();
            System.out.println("Введите номер счета");
            int accountNum = Integer.parseInt(reader.readLine());

            accountService.createAccount(bankName, accountType, accountNum);
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении ввода с консоли");

        }

    }
}
