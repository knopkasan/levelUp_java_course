package ru.levelup.lesson9.homework;

import ru.levelup.lesson9.homework.command.ActionFactory;
import ru.levelup.lesson9.homework.command.ActionType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuService {
    private final BufferedReader consoleReader;
    private final Menu menu;

    private final ActionFactory actionFactory;

    public MenuService() {
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
        this.menu = new Menu();
        this.actionFactory = new ActionFactory();
    }

    public void startMenu() throws IOException{
        int selectedMenu = 0;
        do {
            menu.displayMenu();
            selectedMenu = readSelectedMenu();

            if (selectedMenu == 4) {
                //Отображаем список факультетов
                actionFactory.getAction(ActionType.DISPLAY_ACCOUNTS).doAction(this);
            } else if (selectedMenu == 1) {
                actionFactory.getAction(ActionType.CREATE_ACCOUNT).doAction(this);
            } else if (selectedMenu == 3) {
                actionFactory.getAction(ActionType.CLOSE_ACCOUNT).doAction(this);
            } else if (selectedMenu == 2) {
                actionFactory.getAction(ActionType.UPDATE_ACCOUNT).doAction(this);
            }
        } while (selectedMenu != 0);
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
