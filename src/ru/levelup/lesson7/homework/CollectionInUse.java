package ru.levelup.lesson7.homework;

import java.util.*;

public class CollectionInUse {
    public static void main(String[] args) {

        /**
         * 2 задачка: Сгенерируйте коллекцию целых чисел (любой тип коллекции, но для простоты можете использовать ArrayList), используя класс Random(). Используя методы классов-коллекций:
         * Создайте новую коллекцию, переписав в него часть элементов из первой коллекции (к примеру, первые 10 элементов)
         * Найдите все уникальные числа (те, которые встречаются один раз) и сохраните их в отдельную коллекцию
         * Отсортируйте коллекцию (по возрастанию/убыванию)
         * Найдите максимум, минимум и сумму чисел коллекции
         * Создайте  коллекцию, содержащий все положительные числа первой коллекции
         * Удалите из первого коллекции все нечетные числа
         * Найдите индекс указанного числа в коллекции
         */

        ArrayList<Integer> randomInteger = new ArrayList<>();
        Random numI = new Random();

        for (int i = 0; i < 20; i++) {
            randomInteger.add(numI.nextInt(100));
        }
        System.out.println(randomInteger.toString());

        ArrayList<Integer> cloneMe = new ArrayList<>();

        //добавить первые 10 элементов одного листа в другой
        cloneMe.addAll(randomInteger.subList(0,10));
        System.out.println(cloneMe.toString());

        //в сет сохраняются только уникальные значения
        Set UniqueInteger = new HashSet(randomInteger);


        //сортировка по возрастанию
        randomInteger.sort(Comparator.naturalOrder());

        System.out.println(randomInteger.toString());

        //по убыванию
        randomInteger.sort(Comparator.reverseOrder());

        System.out.println(randomInteger.toString());

        //минимум и максимум
        System.out.println(Collections.max(randomInteger));

        System.out.println(Collections.min(randomInteger));

        //положительные числа
        ArrayList<Integer> onlyPositiveInteger = new ArrayList<>();
        for (Integer num: randomInteger) {
            if (num > 0) {
                onlyPositiveInteger.add(num);
            }
        }

        //удалить все нечетные числа - если делать такую операцию с форич, то выдаст эксепшен, что коллекцию используют с нескольких сторон..
        for (int i = 0; i < randomInteger.size(); i++) {
            if (randomInteger.get(i) % 2 != 0) {
                randomInteger.remove(randomInteger.get(i));
            }
        }
        System.out.println(randomInteger);

        //Найти индекс указанного числа
        System.out.println(randomInteger.indexOf(10));

    }
}
