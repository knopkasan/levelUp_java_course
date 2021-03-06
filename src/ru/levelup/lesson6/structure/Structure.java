package ru.levelup.lesson6.structure;

public interface Structure extends Iterable<Integer> {

    void addValue(int value);

    void removeByValue(int i);

    void removeByIndex(int i);

    void trim();

    int get(int index);

    int getSize();

    boolean isEmpty();
}
