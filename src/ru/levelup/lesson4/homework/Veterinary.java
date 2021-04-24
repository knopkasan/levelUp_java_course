package ru.levelup.lesson4.homework;

public class Veterinary {

    public void treatAnimal(Animal animal) {
        System.out.println("Животное живет в " + animal.location +
                           " и питается " + animal.food);
    }
}
