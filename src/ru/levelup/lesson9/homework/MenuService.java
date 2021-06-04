package ru.levelup.lesson9.homework;

import ru.levelup.lesson9.homework.command.ActionFactory;
import ru.levelup.lesson9.homework.command.ActionType;
import ru.levelup.lesson9.homework.command.actions.Action;
import ru.levelup.lesson9.homework.command.request.*;
import ru.levelup.lesson9.homework.service.PlainTextAccountService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuService {
    private final BufferedReader consoleReader;
    private final Menu menu;
    private final ActionFactory actionFactory;
    private final DateTimeFormatter formatter;

    public MenuService() {
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
        this.menu = new Menu();
        this.actionFactory = new ActionFactory(new PlainTextAccountService());
        this.formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    }

    private ActionRequest readConsoleRequest (int selectedMenu) throws IOException {
        String bankName;
        String accType;
        int accNum = 0;
        double balance = 0.0;
        LocalDate date = LocalDate.now();
        String openDate = date.format(formatter);
        String closeDate = null;

        if (selectedMenu == 4) {
            return new DisplayActionRequest(ActionType.DISPLAY_ACCOUNTS, accNum);
        } else if (selectedMenu == 1) {
            System.out.println("Введите название банка: ");
            bankName = consoleReader.readLine();

            System.out.println("Введите тип счета: ");
            accType = consoleReader.readLine();

            try {
                System.out.println("Введите номер счета: ");
                accNum = Integer.parseInt(consoleReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели не число!");
            }
            return new CreateActionRequest(ActionType.CREATE_ACCOUNT, accNum, bankName, accType,
                    balance, openDate, closeDate);
        } else if (selectedMenu == 3) {
            try {
                System.out.println("Введите номер счета: ");
                accNum = Integer.parseInt(consoleReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели не число!");
            }
            return new CloseActionRequest(ActionType.CLOSE_ACCOUNT, accNum);

        } else if (selectedMenu == 2) {
            try {
                System.out.println("Введите номер счета: ");
                accNum = Integer.parseInt(consoleReader.readLine());

                System.out.println("Введите баланс: ");
                balance = Double.parseDouble(consoleReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели не число!");
            }
            return new UpdateActionRequest(ActionType.UPDATE_ACCOUNT, accNum, balance);
        }
        return null;
    }

    public void startMenu() throws IOException{
        int selectedMenu = 0;
        boolean go = true;

        while (go) {
            menu.displayMenu();
            selectedMenu = readSelectedMenu();
            if (selectedMenu == 0) break;
            ActionRequest request = readConsoleRequest(selectedMenu);
            Action action = actionFactory.create(request);
            action.doAction();
        }
    }

    //считывает значение меню, которое ввел пользователь
    private int readSelectedMenu() throws IOException {
        int enteredNumber = -1;

        do {
            try {
                System.out.println("Введите номер меню:");
                enteredNumber = Integer.parseInt(consoleReader.readLine());
            } catch (NumberFormatException exc) {
                System.out.println("Вы ввели неправильное значение меню. " +
                        "Повторите попытку");
            }
        } while ( enteredNumber < 0 || enteredNumber > 10);
        return  enteredNumber;
    }
}
