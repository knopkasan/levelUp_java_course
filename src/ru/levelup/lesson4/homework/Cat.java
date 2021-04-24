package ru.levelup.lesson4.homework;

public class Cat extends Animal{
    String breed;

    public Cat(String food, String location, String breed) {
        this.food = food;
        this.location = location;
        this.breed = breed;
    }

    @Override
    public void eat(){
        System.out.println("Кошка ест " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }
}
