package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class ActionRequest {
    private final int accountNum;
    private final ActionType type;

    public ActionRequest(ActionType type, int accountNum) {
        this.accountNum = accountNum;
        this.type = type;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public ActionType getType() {
        return type;
    }
}
