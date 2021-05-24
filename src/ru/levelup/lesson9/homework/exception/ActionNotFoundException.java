package ru.levelup.lesson9.homework.exception;


import ru.levelup.lesson9.homework.command.ActionType;

public class ActionNotFoundException extends RuntimeException {
    public ActionNotFoundException(ActionType actionType) {
        super("No defined action for passed action type " + actionType.name());
    }
}
