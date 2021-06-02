package ru.levelup.lesson9.homework.command.request;

import ru.levelup.lesson9.homework.command.ActionType;

public class DisplayActionRequest extends ActionRequest{

    public DisplayActionRequest(ActionType type, int accountNum) {
        super(type, accountNum);
    }
}
