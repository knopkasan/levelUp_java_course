package ru.levelup.lesson5.homework;

public class FilterService {
    Object[] filterArray(Object[] objects, BaseFilter baseFilter) {
        int n = 0;

        //проверяем, сколько элементов будет в новом массиве, отфильтрованном
        for (int i = 0; i < objects.length; i++) {
            if (baseFilter.filter(objects[i])) {
                n++;
            }
        }
        //создаем новый массив
        Object[] newObj = new Object[n];
        n = 0;

        //записываем в новый массив отфильтрованные элементы
        for (int i = 0; i < objects.length; i++) {
            if (baseFilter.filter(objects[i])) {
                newObj[n++] = objects[i];
            }
        }

        return newObj;
    }
}
