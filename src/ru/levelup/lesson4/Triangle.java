package ru.levelup.lesson4;

//subclass
public class Triangle extends Shape {

    @Override
    double calculatePerimeter() {
        System.out.println("CalculatePerimeter from Triangle");
        return sides[0] + sides[1] + sides[2];
    }
}
