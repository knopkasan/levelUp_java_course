package ru.levelup.lesson5;

public class ComparisonApp {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Lenovo", 8, 2.8);
        Laptop l2 = new Laptop("Lenovo", 8, 2.8);
        Laptop l3 = l1;//для такого случая == вернет true, так как l1 и l3 ссылаются на одну и ту же область памяти

        boolean isEqual = l1 == l2; //== - сравнивает тссылки между собой
        System.out.println(isEqual);

        boolean equals = l1.equals(l2);
        System.out.println(equals);


    }
}
