package ru.levelup.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();

        prices.put("Молоко", 55.55);
        prices.put("Яйца", 70.55);
        prices.put("Гречка", 100.55);
        prices.put("Вода", 30.55);

        double milkPrice = prices.get("Молоко");
        System.out.println(milkPrice);


        //keySet() - множество ключей
        //values() - коллекция всех значений
        //entrySet() - множество entry
        System.out.println();
        Set<String> keys = prices.keySet();
        for (String key : keys) {
            Double value = prices.get(key);
            System.out.println("Key: " + key + ", value: " + value);
        }

        System.out.println();
        Set<Map.Entry<String, Double>> enntries = prices.entrySet();
        for (Map.Entry<String, Double> entry : enntries) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
