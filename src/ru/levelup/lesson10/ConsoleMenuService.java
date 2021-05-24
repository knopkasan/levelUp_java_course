package ru.levelup.lesson10;


import ru.levelup.lesson10.command.ActionFactory;
import ru.levelup.lesson10.command.ActionType;
import ru.levelup.lesson10.command.actions.DisplayFacultiesAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenuService {
    private final BufferedReader consoleReader;
    private final ConsoleMenu consoleMenu;

    private final ActionFactory actionFactory;

    public ConsoleMenuService() {
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
        this.consoleMenu = new ConsoleMenu();
        this.actionFactory = new ActionFactory();
    }

    public void startMenu() throws IOException{
        int selectedMenu = 0;
        do {
            consoleMenu.displayMenu();
            selectedMenu = readSelectedMenu();

            if (selectedMenu == 1) {
                //Отображаем список факультетов
                actionFactory.getAction(ActionType.DISPLAY_FACULTIES).doAction(this);
            } else if (selectedMenu == 2) {
                actionFactory.getAction(ActionType.CREATE_FACULTY).doAction(this);
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
