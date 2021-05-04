package ru.levelup.lesson5.homework;

import java.util.Arrays;

public class TestDrive {

    public static void main(String[] args) {

        //задание 1
        Game favor = new Game("Hollow Knights", 100, "Indie");

        Game[] games = new Game[]{new Game("Witcher III", 1000, "RPG"),
                new Game("Sims 3", 500, "Simulator"),
                new Game("Civilization IV", 2000, "Strategy"),
                new Game("Hollow Knights", 100, "Indie")};

        for (Game game : games) {
            if (game.equals(favor)) {
                System.out.println("I like " + favor.getName());
            }
        }

        //задание 2
        FilterService filter = new FilterService();
        BaseFilter baseFilter = new GameFilter();

        Game[] gameWithBug = new Game[]{new Game("Witcher III", 1000, "RPG"),
                new Game("Sims 3", 500, "Simulator"),
                new Game("Civilization IV", 2000, "Strategy"), null};

        Object[] os = filter.filterArray(gameWithBug, baseFilter);
        Game[] checkedArray = new Game[os.length];

        for (int i = 0; i < os.length; i++) {
                checkedArray[i] = (Game) os[i];
        }

        System.out.println(Arrays.toString(checkedArray));

        //System.out.println(checkedArray.getClass().getName());
//
        //int[] arr = new int[3];
//
       // System.out.println(arr.getClass().getName());
    }
}
