package ru.levelup.lesson4.homework;

public class Horse extends Animal{
    String color;

    public Horse(String food, String location, String color) {
        this.food = food;
        this.location = location;
        this.color = color;
    }

    @Override
    public void eat(){
        System.out.println("Лошадь ест " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го!");
    }
}
