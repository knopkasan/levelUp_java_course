package ru.levelup.lesson5;

//private - доступ только внутри класса
//default-package (private-package) - доступ только внутри пакета.
// выглядит как отсутствие модификатора доступа
//protected - доступ внутри класса, внутри пакета и внутри наследника
//public
public class TriplePoint {

    private int x;
    int y;
    int z;

    public void changeXCoordinate(int x) {
        if (x > 0) {
            this.x = x;
        }
    }

    //getter
    public int getX() {
        return x;
    }

    //setter
    public void setX(int x) {
        this.x = x;
    }

    private boolean checkInterval(int value) {
        return value > 0;
    }
}
