package ru.levelup.lesson4;

//subclcss
public class Rectangle extends Shape {

    Rectangle() {
        //super();//вызов конструктора суперкласса
        System.out.println("Rectangle constructor invoke...");
    }

    Rectangle(int width, int height) {
         super(new int[] {width, height, width, height});
    }

    double calculateSquare () {
        return sides[0] * sides[1];
    }

}
