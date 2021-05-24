package ru.levelup.lesson9.homework.command;

public enum ActionType {

    CREATE_ACCOUNT(1),
    UPDATE_ACCOUNT(2),
    CLOSE_ACCOUNT(3),
    DISPLAY_ACCOUNTS(4);

    private final int actionIndex;

    ActionType(int actionIndex) {
        this.actionIndex = actionIndex;
    }

    public int getActionIndex() {
        return actionIndex;
    }
}
