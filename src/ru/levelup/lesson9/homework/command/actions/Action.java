package ru.levelup.lesson9.homework.command.actions;


import ru.levelup.lesson9.homework.MenuService;

public interface Action {
    void doAction(MenuService consoleMenuService);
}
