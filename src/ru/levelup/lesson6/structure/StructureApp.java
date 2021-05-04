package ru.levelup.lesson6.structure;


import java.util.Arrays;

public class StructureApp {

    public static void main(String[] args) {
        Structure s = new DynamicArray(3);
        s.addValue(4);
        s.addValue(6);
        s.addValue(67);
        s.addValue(888);
        s.addValue(1);

        s.removeByValue(67);

        s.removeByIndex(2);

        s.trim();
    }
}
