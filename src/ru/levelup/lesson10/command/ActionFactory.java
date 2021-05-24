package ru.levelup.lesson10.command;

import ru.levelup.lesson10.command.actions.Action;
import ru.levelup.lesson10.command.actions.DisplayFacultiesAction;
import ru.levelup.lesson10.exception.ActionNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    //private final EnumMap<ActionType, Action> actionMap;
    private final Map<ActionType, Action> actionMap;

    public ActionFactory() {
        //this.actionMap = new EnumMap<>(ActionType.class);
        //new EnumMap(...) <- Class<Key>, где key - это enum - <Название нашего enum>.class
        this.actionMap = new HashMap<>();
        this.actionMap.put(ActionType.DISPLAY_FACULTIES, new DisplayFacultiesAction());
    }

    public Action getAction(ActionType actionType) {
        Action action = actionMap.get(actionType);
        if (action == null) {
            throw new ActionNotFoundException(actionType);
        }
        return action;
    }
}
