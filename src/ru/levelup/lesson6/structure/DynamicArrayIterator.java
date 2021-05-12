package ru.levelup.lesson6.structure;

import java.util.Iterator;

public class DynamicArrayIterator implements Iterator<Integer> {

    private int[] elements;
    private int currentIndex;
    private int elementscount;

    public DynamicArrayIterator(int[] elements, int elementscount) {
        this.elements = elements;
        this.elementscount = elementscount;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elementscount;
    }

    @Override
    public Integer next() {
        return elements[currentIndex++];
    }
}
