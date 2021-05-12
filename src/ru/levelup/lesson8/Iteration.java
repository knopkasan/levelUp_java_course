package ru.levelup.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();

        prices.add(54.55);
        prices.add(88.99);
        prices.add(11.0);
        prices.add(65.99);
        prices.add(1000.99);
        prices.add(71.99);

        //объект для прохода по коллекции
        Iterator<Double> iter = prices.iterator();
        while (iter.hasNext()) {
            Double el = iter.next();
        }

    }
}
