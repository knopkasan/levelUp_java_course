package ru.levelup.lesson10;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        try {
            ConsoleMenuService menuService = new ConsoleMenuService();
            menuService.startMenu();
        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения с консоли. " +
                    "Программа завершилась.");
        }

    }
}
