package ru.levelup.lesson3;

public class ArrayUtil {


    public static void main(String[] args) {
        int[] arr = {4, 10, 5 ,7, 3, 0, 15};

        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    //Написать класс ArrayUtil. У него два метода - min(int[] array) и max(int[] array).
    // Он должен возвращать вам минимум и максимум из переданного массива.
    // Т.е. в метод min вы передаете массив, а в ответ вам возвращается число,
    // которое является минимум из переданного массива.
    public static int min(int[] array) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }

    public static int max(int[] array) {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }



}
