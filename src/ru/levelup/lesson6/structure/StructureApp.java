package ru.levelup.lesson6.structure;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StructureApp {

    public static void main(String[] args) {
        Structure s = new DynamicArray(3);
        s.addValue(4);
        s.addValue(6);
        s.addValue(67);
        s.addValue(888);
        s.addValue(1);

        s.removeByValue(67);

        s.removeByIndex(2);

        s.trim();


//        OneWayList str = new OneWayList();
//        str.addValue(66);
//        str.addValue(2);
//        str.addValue(66);
//        str.addValue(2);
//        str.addValue(2);
//        str.addValue(4);
//        str.addValue(2);
//
//        for(int i = 0; i < str.getSize(); i++) {
//            System.out.println(str.get(i));
//        }
//
//        System.out.println();
//
//      str.removeByValue(2);
//
//        for(int i = 0; i < str.getSize(); i++) {
//            System.out.println(str.get(i));
//        }
//
//        System.out.println();
//
//        str.removeByIndex(5);
//
//        for(int i = 0; i < str.getSize(); i++) {
//            System.out.println(str.get(i));
//        }

        Iterator<Integer> iter = s.iterator();
        while (iter.hasNext()) {
            Integer el = iter.next();
            System.out.println(el);
        }
    }
}
