package ru.levelup.lesson3;


public class ArraySorting {


    public static void main(String[] args) {
        int[] arr = {4, 10, 5 ,7, 3, 0, 15};

        int[] sortedArray = bubbleSort(arr);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

    }

    //Написать класс ArraySorting, в котором будет метод bubbleSort. Он на вход принимает массив целых чисел (int),
    // a на выход отдает новый! массив с отсортированными по возрастанию значениями.
    // Вам нужно выполнить сортировку массива с помощью сортировки пузырьком.
    public static int[] bubbleSort(int[] array) {
        int[] newArray = array.clone();
        int temp = 0;
        for (int i = 0; i < newArray.length - 1; i++ ) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }
}
