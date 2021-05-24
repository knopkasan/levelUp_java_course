package ru.levelup.lesson9.homework.service;

import ru.levelup.lesson9.homework.domain.Account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class ConsoleInputAccountService implements AccountService{
    @Override
    public Collection<Account> LoadAccountList() {
        return null;
    }

    @Override
    public Account createAccount(String bankName, String accountType, int accountNum) {
        return null;
    }

    @Override
    public int ReceiveAccountNum() {
        System.out.println("Введите номер счета:");
        return Integer.parseInt(ReceiveUserInput());
    }

    @Override
    public double ReceiveAccountBalance() {
        System.out.println("Введите новый баланс:");
        String balance = ReceiveUserInput();
        return Double.parseDouble(balance);
    }

    public String ReceiveUserInput() {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {

            String input = reader.readLine();
            return input;
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении ввода с консоли");
            return null;
        }

    }
}
