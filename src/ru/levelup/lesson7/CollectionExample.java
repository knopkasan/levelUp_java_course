package ru.levelup.lesson7;


import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<String> productName = new ArrayList<>();//ArrayList - DynamicArray
        // Лучше использовать объекты типа интерфейса. т.к. можно просто поменять класс
        // создаваемого объекта и не менять код
        productName.add("Мясо");
        productName.add("Сметана");
        productName.add("Яйца");

        for (String name : productName) {
            System.out.println(name);
        }

        System.out.println();
        int eggsIndex = productName.indexOf("Яйца");
        System.out.println("Egg's index: " + eggsIndex);

        int doesNotExist = productName.indexOf("Курица");
        System.out.println("Does not exist: " + doesNotExist);
        System.out.println();

        productName.add("Петрушка");
        for (String name : productName) {
            System.out.println(name);
        }
    }
}
