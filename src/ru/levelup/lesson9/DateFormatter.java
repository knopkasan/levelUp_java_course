package ru.levelup.lesson9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public Date transformToDate(String value) {
        //d - 4
        // dd - 04
        //M - month
        //m - minutes
        //hh - 12 hour
        //HH - 24 hour
        //S - millisec, s - sec
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        try {
            Date date = formatter.parse(value);
            return date;
        } catch(ParseException ex) {
            //описываем, что делать, если исключение произошло
            System.out.println("Была передана дата в неправильном формате");
            //return null;
            throw new RuntimeException("Была передана дата в неправильном формате");
        }
    }
}
