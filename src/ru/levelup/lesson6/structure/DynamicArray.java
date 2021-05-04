package ru.levelup.lesson6.structure;

import java.util.Arrays;
import java.util.Locale;

//динамический массив - список на основе массива
//список - набор однотипных элементов
//
public class DynamicArray implements Structure {

    private int[] elements;
    private int size; //1. количество элементов в массиве
    // 2. индекс, куда вставлять следующий эелемент

    public DynamicArray(int initialCapacity) {
        this.elements = new int[initialCapacity];
        this.size = 0;
    }

    //вставка в конец
    //
    @Override
    public void addValue(int value) {
        if (elements.length == size) {
            int[] oldArray = elements;
            elements = new int[size * 2];
            System.arraycopy(oldArray, 0, elements, 0, oldArray.length);
            //elements = oldArray.clone(); - это перезаписывание массива. новый размер пропадет
        }

        elements[size++] = value;
    }
    /**
     * 1 задачка:
     * Написать методы класса DynamicArray.
     * removeByValue(int value) - удаляет все элементы из массива,
     * которые равны заданному значению. К примеру, removeByValue(3),
     * массив элементов [3, 5, 6, 3 8, 4], в результате должны остаться [5, 6, 8, 4].
     * removeByIndex(int index) - удаляет элемет по идексу
     * trim() - уменьшает размер массива до количества элементов,
     * т.е. Если размер массива 9, а элементов 5, то размер массива должен стать равным 5.
     * get(int index) - получение элемента по индексу
     * getSize() - получение размера списка
     * isEmpty() - возвращает true, если список пуст, иначе false.
     */
    public void removeByValue(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                elements[i] = 0;
                size--;
            }
        }
        sortArray("desc");
        //System.out.println(Arrays.toString(elements));
    }

    public void removeByIndex(int index) {
        elements[index] = 0;
        size--;
        sortArray("desc");
    }

    public void trim() {
        if (size < elements.length) {
            int[] oldArray = elements;
            elements = new int[size];
            System.arraycopy(oldArray, 0, elements, 0, size);
        }
        //System.out.println(Arrays.toString(elements));
    }

    public int get(int index) {
        return elements[index];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        int chk = 0;
        for (int elem : elements) {
            if (elem != 0) chk++;
        }
        return chk == 0;
    }

    public void sortArray(String type) {
        if (type.toLowerCase().equals("asc")) {
            int temp = 0;
            for (int i = 0; i < elements.length - 1; i++ ) {
                for (int j = i + 1; j < elements.length; j++) {
                    if (elements[i] > elements[j]) {
                        temp = elements[i];
                        elements[i] = elements[j];
                        elements[j] = temp;
                    }
                }
            }
        } else if (type.toLowerCase().equals("desc")) {
            int temp = 0;
            for (int i = 0; i < elements.length - 1; i++ ) {
                for (int j = i + 1; j < elements.length; j++) {
                    if (elements[i] < elements[j]) {
                        temp = elements[i];
                        elements[i] = elements[j];
                        elements[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("Введите asc - для сортировки по возрастанию, " +
                               "desc - для сортировки по убыванию.");
        }

    }

}
