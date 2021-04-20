package ru.levelup.lesson2;

public class Loop {
    public static void main(String[] args) {

        for (int counter = 0; counter < 7; counter++) {
            System.out.println("I like loop :) ");
        }
        //for (;;) {} - бесконечный цикл
        //for (int a = 0, b = 1; a < 10; a++; b + 2) {}

        int idx = 0;
        while (idx < 10) {
            idx += 2;
            System.out.println("Idx: " + idx);
        }

    }
}
