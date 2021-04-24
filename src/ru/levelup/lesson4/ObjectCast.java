package ru.levelup.lesson4;

public class ObjectCast {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        Shape s = r;
        Object or = r;
        Object os = s;

       // r.calculateSquare();

        Triangle t = new Triangle();
        t.sides = new int[] {1, 2, 5};

        Shape st = t;//тут ничего не происходит. будет взят метод от объекта t
        double p = st.calculatePerimeter();//тут вызывается переопределенный метод класса Triangle
        System.out.println("Perimeter shape: " + p);

    }
}
