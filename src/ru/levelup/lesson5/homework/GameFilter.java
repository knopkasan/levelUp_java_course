package ru.levelup.lesson5.homework;

public class GameFilter extends BaseFilter {
    @Override
    boolean filter(Object object) {
        if (object == null) {
            return false;
        } else
            return true;
    }
}
