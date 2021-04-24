package ru.levelup.lesson4;

//DRY - don't repeat yourself
//superclass
public class Shape {

    int[] sides; //длины сторон фигуры

    Shape() {
        System.out.println("Shape constructor invoke...");
    }

    Shape(int[] sides) {
        this.sides = sides;
    }

    double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }
}
