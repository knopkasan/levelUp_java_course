package ru.levelup.lesson8;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemove {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        //Для коллекции с типом Integer метод remove работает по-разному (по индексу и по вэлью), так как
        //компилятор не сможет понять, какой именно вызывать метод
        //чтобы удалять по вэлью нужно использовать метод Integer.valueOf()
        numbers.remove(Integer.valueOf(5)); //удалит по значению
        numbers.remove(2); // удалит по индексу
    }
}
