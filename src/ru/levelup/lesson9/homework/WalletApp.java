package ru.levelup.lesson9.homework;

import java.io.IOException;

public class WalletApp {

    public static void main(String[] args) {
        try {
            MenuService menuService = new MenuService();
            menuService.startMenu();
        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения с консоли. " +
                    "Программа завершилась.");
        }

    }
}
