package ru.levelup.lesson4;

public class PolymorphismExample extends Shape {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6);
        Rectangle r2 = new Rectangle(9, 8);
        Triangle t1 = new Triangle();
        t1.sides = new int[] {6, 9, 12};

        Shape s = new Shape();
        s.sides = new int[] {9, 3, 2, 5, 7};

        //Тип объекта определяется конструктором
        Shape rs = new Rectangle(7, 8);

        Shape [] shapes = new Shape[4];

        shapes[0] = r1;
        shapes[1] = r2;
        shapes[2] = t1;
        shapes[3] = s;

        double avg = avgPerimeter(shapes);
        System.out.println("Avg perimeter: " + avg);

    }

    static double avgPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calculatePerimeter();
        }

        return sum / shapes.length;
    }


}
