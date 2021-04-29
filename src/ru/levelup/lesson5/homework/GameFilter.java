package ru.levelup.lesson5.homework;

public class GameFilter extends BaseFilter {
    @Override
    boolean filter(Object object) {
        if (!(object instanceof Game)) return false;
        Game game = (Game) object;
        return !(game == null);
    }
}
