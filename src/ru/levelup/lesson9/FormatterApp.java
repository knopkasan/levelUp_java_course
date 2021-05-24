package ru.levelup.lesson9;

import java.util.Date;

public class FormatterApp {
    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        String value = "12.03.2001 12:16:54";

        Date date = formatter.transformToDate(value);
        System.out.println(date);
    }
}
