package ru.levelup.lesson2;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        double p1Prices = 342.14;
        double p2Prices = 9864.00;
        double p3Prices = 17.11;
        double p4Prices = 276.34;


        //Объявление массива
        // Максимальное количество элементов в массиве - по int (2147483647)
        double[] prices=  new double[4];

        //Запись значений в массик
        prices[0] = p1Prices;
        prices[1] = p2Prices;
        prices[2] = p3Prices;
        prices[3] = p4Prices;

        //Чтение хначения элемента массива по индексу
        System.out.println(prices[2]);

        //Вывести весь массив в консоль
        int length = prices.length;
        for (int i = 0; i < length; i++) {
            System.out.println(prices[i]);
        }

        double sum = 0;
        for (int idx = 0; idx < prices.length; idx++) {
            sum += prices[idx];
        }
        double average = sum / prices.length;
        System.out.println("Average: " + average);

        int[] intArray = new int[20];
        Random r = new Random();
        for (int i = 0;i < intArray.length; i++) {
            intArray[i] = r.nextInt(10);
            System.out.println(intArray[i]);
        }


    }
}
