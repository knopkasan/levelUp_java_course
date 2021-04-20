package ru.levelup.lesson3;

public class Point {
    // Переменной класса - поле класса (данные, которые будет хранить объект) (field)
    int x;
    int y;
    String name;

    // default constructor
    // public Point() {}

    // <Имя_класса>(аргументы...)
    Point() {
        this.x = 0;
        this.y = 0;
        this.name = "(no name)";
    }

    Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // <тип_возвращаемого_значения> <имя_метода>(<тип_параметра1> <название_параметра1>, <тип_параметра2> <название_параметра2>)
    // <тип_возвращаемого_значения> <имя_метода>() - метод не имеет параметров
    // void <имя_метода>() - метод не возвращает результат

    void changeCoordinates(int x, int y) {
        // this.x - значение x, объекта который вызвал метод changeCoordinates
        if (checkInterval(x)) {
            this.x = x;
            // this.x = newX;
        }
        // boolean yCheck = checkInterval(newY)
        // if (yCheck) {}
        if (checkInterval(y)) {
            this.y = y;
        }
    }

    boolean checkInterval(int coordinate) {
        // return <переменная>/<выражение, тип результата которого совпадает с типом возращаемого значения>
        // boolean result = coordinate >= -10 && coordinate <= 10;
        // return result;
        return coordinate >= -10 && coordinate <= 10;
    }

    // Сигнатура метода - название метода + его аргументы (типы и порядок аргументов)

    // int sum(int a, double b); - sum(int, double)
    // 1, 3, 4, 6

    // 1. int sum(double a, int b) - sum(double, int) - yes
    // 2. int sum(int b, double a) - sum(int, double) - no
    // 3. int sum(int a, int b)    - sum(int, int) - yes
    // 4. int sum(double a, double b) - sum(double, double) - yes
    // 5. double sum(int b, double a) - sum(int, double) - no
    // 6. double sum(double a, int b) - sum(double, int) - yes

    // Overloading (перегрузка метода)
    void setFields(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setFields(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name.toUpperCase();
    }
}
