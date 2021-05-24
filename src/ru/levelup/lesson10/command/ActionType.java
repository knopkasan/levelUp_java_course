package ru.levelup.lesson10.command;

//все enum уже наследуются от класса enum
//может реализовывать интерфейсы
//может иметь абстрактные методы
public enum ActionType {
    //new Actions(1) {} - анонимный внутренний класс 1
    //new Actions(1) {} - анонимный внутренний класс 2
    DISPLAY_FACULTIES(1),
    CREATE_FACULTY(2);

    private final int actionIndex;

    ActionType(int actionIndex) {
        this.actionIndex = actionIndex;
    }

    public int getActionIndex() {
        return actionIndex;
    }

    //public abstract void doAction();
}
