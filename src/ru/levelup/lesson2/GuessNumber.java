package ru.levelup.lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        //Считывание с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scan.nextInt();

        //Генерация случайных чисел
        Random r = new Random();

        //nextInt(5) > [0, 5)
        //nextInt(11) + 10 - отодвинуть нижнюю границу и верхнюю
        int secretNum = r.nextInt(5);
        System.out.println(secretNum);

        if(num > secretNum) {
            System.out.println("Число больше, чем секретное");
        } else if (num == secretNum) {
            System.out.println("Числа совпадают");
        } else {
            System.out.println("Число меньше, чем секретное");
        }
    }
}
