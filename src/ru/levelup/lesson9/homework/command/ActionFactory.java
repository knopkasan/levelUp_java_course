package ru.levelup.lesson9.homework.command;

import ru.levelup.lesson9.homework.command.actions.*;
import ru.levelup.lesson9.homework.exception.ActionNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private final Map<ActionType, Action> actionMap;

    public ActionFactory() {
        //this.actionMap = new EnumMap<>(ActionType.class);
        //new EnumMap(...) <- Class<Key>, где key - это enum - <Название нашего enum>.class
        this.actionMap = new HashMap<>();
        this.actionMap.put(ActionType.DISPLAY_ACCOUNTS, new DisplayAccountAction());
        this.actionMap.put(ActionType.CLOSE_ACCOUNT, new CloseAccountAction());
        this.actionMap.put(ActionType.CREATE_ACCOUNT, new CreateAccountAction());
        this.actionMap.put(ActionType.UPDATE_ACCOUNT, new UpdateAccountAction());
    }

    public Action getAction(ActionType actionType) {
        Action action = actionMap.get(actionType);
        if (action == null) {
            throw new ActionNotFoundException(actionType);
        }
        return action;
    }
}
