package ru.levelup.lesson4.homework;

public class Dog extends Animal{
    String size;

    public Dog(String food, String location, String size) {
        this.food = food;
        this.location = location;
        this.size = size;
    }

    @Override
    public void eat(){
        System.out.println("Собака ест " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }
}
