package ru.levelup.lesson3;


public class App {
    public static void main(String[] args) {
        //переменная - это переменная примитивного типа
        // переменная ссылочного типа - объект
        // p1 - объект, экземпляр, ссылка/ object, instance, reference
        Point p1 = new Point(); // объявили переменную p1 с типом - Point - объект.
        //оператор new ищет и резервирует место под объект и возвращает указатель на него
        Point p2 = new Point();

        p2.x = 5;
        p2.y = -7;

        p1.changeCoordinates(9, 3);
        p2.changeCoordinates(-10,10);


        p1.setFields(3, 2);
        p1.setFields(3, 3, "A");

        // p3 - 536abcd3da
        Point p3 = new Point(6, -2, "C");

//        Point p4 = null; // - null
//        p4.changeCoordinates(1, 2);
//        p4.x = 4;


    }
}
