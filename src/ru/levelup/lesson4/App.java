package ru.levelup.lesson4;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Shape s = new Shape();
        s.sides = new int[] {1, 2, 4, 7, 9, 4};

        Rectangle r = new Rectangle();
        r.sides = new int[] {3, 4, 3, 4};

        Triangle t = new Triangle();
        t.sides = new int[] {3, 4, 5};

        double shapePerimeter = s.calculatePerimeter();
        double rectanglePerimeter = r.calculatePerimeter();

        System.out.println("Shape perimeter: " + shapePerimeter);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);

        double rectangleSquare = r.calculateSquare();
        System.out.println("Rectangle square: " + rectangleSquare);


        //new Rectangle:
        //0. Отрабатывает конструктор Object
        //1. Отрабатывает конструктор Shape
        //2. Отрабатывает конструктор Rectangle
        Rectangle bigRectangle = new Rectangle(365, 395);
        System.out.println(Arrays.toString(bigRectangle.sides));//возвращает строковое представление массива

        double trianglePerimeter = t.calculatePerimeter();
        System.out.println("Triangle perimeter: " + trianglePerimeter);
    }
}
