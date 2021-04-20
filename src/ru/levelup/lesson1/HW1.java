package ru.levelup.lesson1;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {

        /* ex1. Написать программу, которая производит математические операции
        * на двумя переменными a и b и вывести результаты на экран.
        * Т.е. должны быть выведены сумма, разность, проиведение и частное.
        * Попробуйте с разными типами a и b. Есть ли среди результатов отличия?*/

        int a1 = 3;
        int b1 = 5;

        System.out.println(a1 + b1);

        System.out.println(b1 - a1);

        System.out.println(a1 * b1);

        // при делениее интов дробная часть откидывается
        System.out.println(b1 / a1);

        //А это остаток от деления: b1 = a1 * частное + остаток
        System.out.println(b1 % a1);

        //Меняем на double
        System.out.println((double)a1 + (double)b1);

        System.out.println((double)b1 - (double)a1);

        System.out.println((double)a1 * (double)b1);

        // при делениее чисел с плавающей точкой дробная часть не откидывается
        System.out.println((double)b1 / (double)a1);



        //Меняем на long
        System.out.println((long)a1 + (long)b1);

        System.out.println((long)b1 - (long)a1);

        System.out.println((long)a1 * (long)b1);

        System.out.println((long)b1 / (long)a1);



        /* ex2. Написать программу осуществляющую решение линейного
        * уравнения ax + b = 0. a и b задаете в программе, х выводите на экран. */

        //Создать экземпляр класса Scanner для считывания данных из консоли
        Scanner scan = new Scanner(System.in);

        //Принять на вход переменные a и b
        double a = scan.nextInt();
        double b = scan.nextInt();

        //Решить уравнение виде a * x + b = 0
        double x = (- b) / a;

        //Вывести решение в консоль
        System.out.println(x);

    }







}
