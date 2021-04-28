package ru.levelup.lesson5.homework;

import java.util.Objects;

public class Game {
    /**
     * 1 задачка: Создайте класс любой сущности на выбор.
     * Определите у нее несколько полей, конструктор с параметрами и переопределите
     * метод equals. Далее в методе main создайте массив из объектов этого класса.
     * И попробуйте с помощью цикла и метода equals найти объект в массиве.
     */
    private String name;
    private double cost;
    private String genre;

    public Game(String name, double cost, String genre) {
        this.name = name;
        this.cost = cost;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game in = (Game) o;
        return Objects.equals(name, in.name) &&
                cost == in.cost && Objects.equals(genre, in.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, genre);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", genre='" + genre + '\'' +
                '}';
    }
}
