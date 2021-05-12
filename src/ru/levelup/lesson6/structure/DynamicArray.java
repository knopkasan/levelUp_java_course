package ru.levelup.lesson6.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
    @Override
    public void removeByValue(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                //array shift
                System.arraycopy(elements, i + 1, elements, i, elements.length - i - 1);
                size--;
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        System.arraycopy(elements, index + 1, elements, index, elements.length - index - 1);
        size--;
    }

    @Override
    public void trim() {
        if (size < elements.length) {
            int[] oldArray = elements;
            elements = new int[size];
            System.arraycopy(oldArray, 0, elements, 0, size);
        }
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() { return size == 0; }


    //класс должен имплементировать интерфейс Iterable. - значит, что по классу можно пройтись итератором
    //- у класса появляется метод iterator, который возвращает титератор для класса
    //- класс Iterator - то, как мы будем итерироваться по классу
    @Override
    public Iterator<Integer> iterator() {
        return new DynamicArrayIterator(elements, size);
    }
}
