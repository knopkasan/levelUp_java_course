package ru.levelup.lesson8.homework;

import java.util.*;

public class SetExample {
    /**
     * 2 задачка:
     * Напишите методы
     * Set<Object> union(Set<Object> set1, Set<Object> set2)
     * Set<Object> intersect(Set<Object> set1, Set<Object> set2)
     *
     * реализующих операции объединения и пересечения множеств.
     * Первый метод объединяет два сета, второй находит одинаковые значения в двух сетах.
     */

    Set<Object> union(Set<Object> set1, Set<Object> set2) {
        Set<Object> result = new HashSet<>(set1);
        for (Object set : set2) {
            result.add(set);
        }
        return result;
    }

    Set<Object> intersect(Set<Object> set1, Set<Object> set2) {
        Set<Object> result = new HashSet<>();
        for (Object userA: set1) {
            for (Object userB : set2)
            {
                if(userA.equals(userB)) {
                    result.add(userA);
                }
            }
        }
        return result;
    }
}
