package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class CloseActionRequest extends ActionRequest{

    public CloseActionRequest(ActionType actionType, int accountNum) {
        super(actionType, accountNum);
    }
}
