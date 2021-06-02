package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class UpdateActionRequest extends ActionRequest{
    private final double balance;

    public UpdateActionRequest(ActionType actionType, int accountNum, double balance) {
        super(actionType, accountNum);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
