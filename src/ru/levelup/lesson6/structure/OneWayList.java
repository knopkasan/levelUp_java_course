package ru.levelup.lesson6.structure;

public class OneWayList implements Structure{

    private ListElement head;
    private int size;

    @Override
    public void addValue(int value) {
        ListElement elem = new ListElement(value);
        if (head == null) { //список пустой
            head = elem;
        } else {
            ListElement currentPointer = head;
            while (currentPointer.getNext() != null) {
                currentPointer = currentPointer.getNext();
            }
            //currentPointer - ссылка на последний элемент
            currentPointer.setNext(elem);
        }
        size++;
    }

    /**
     * 1 задачка: Дописать методы в классе OneWayList.
     * removeByIndex(int index) - удаляет элемет по идексу
     * removeByValue
     * trim() - уменьшает размер массива до количества элементов, т.е. Если размер массива 9, а элементов 5, то размер массива должен стать равным 5.
     * get(int index) - получение элемента по индексу
     * getSize() - получение размера списка
     * isEmpty() - возвращает true, если список пуст, иначе false.
     */
    @Override
    public void removeByValue(int value) {
        //todo: сделать дома
        if (head == null) { //список пустой
            System.out.println("Нет элементов!");
        }
            ListElement currentPointer = head;
            ListElement previousElement = null;
            if (currentPointer.getValue() == value) {
                head = head.getNext();
            }

            while (currentPointer != null && currentPointer.getValue() != value) {
                previousElement = currentPointer;
                currentPointer = currentPointer.getNext();
            }

            if (currentPointer == null) {
                System.out.println("Такого элемента нет");
                return;
            }
            previousElement = currentPointer.getNext();
            size--;
        }

    @Override
    public void removeByIndex(int index) {
        if (this.head == null) {
            System.out.println("Нет элементов!");
            return;
        }

        ListElement elementToBeDeleted = head;
        ListElement previous = null;

        if (index == 0 && elementToBeDeleted != null) {
            this.head = elementToBeDeleted.getNext();
            size--;
            return;
        }

        for (int i = 0; elementToBeDeleted != null && i < index - 1; i++) {
            elementToBeDeleted = elementToBeDeleted.getNext();
        }

        if (elementToBeDeleted == null || elementToBeDeleted.getNext() == null) {
            System.out.println("Такого элемента нет!");
            return;
        }

        previous = elementToBeDeleted.getNext();
        size--;
    }

    @Override
    public void trim() {}

    @Override
    public int get(int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return 0;
        }

        ListElement elem = head;
        if (index == 0) {
            return head.getValue();
        }

        for (int i = 0; elem != null && i < index; i++) {
            elem = elem.getNext();
        }
        return elem.getValue();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
