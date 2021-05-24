package ru.levelup.lesson10.exception;

import ru.levelup.lesson10.command.ActionType;

public class ActionNotFoundException extends RuntimeException {

    public ActionNotFoundException(ActionType actionType) {
        super("No defined action for passed action type " + actionType.name());
    }
}
