package ru.levelup.lesson6.structure;

public class Stack {

    private int[] array;
    private int topIndex; //куда вставлять следующий элемент
                            //откуда забирать элемент

    public Stack(int capacity) {
        this.array = new int[capacity];
    }

    public void push(int value) {
        if (topIndex != array.length) {
            array[topIndex++] = value;
        }
    }

    public int pop() {
        if (topIndex > 0) {
            return array[--topIndex];
        }
        return 0;
    }
}
