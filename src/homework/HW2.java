package homework;

import java.util.Random;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //1. Создать программу, проверяющую и сообщающую на экран,
        // является ли целое число записанное в переменную n, чётным либо нечётным.
        System.out.println("Введите число");
        int num1 = scan.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        //2. Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел,
        // записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        System.out.println("Введите число");
        double n = scan.nextDouble();
        double m = scan.nextDouble();
        double ten = 10;
        double temp1 = Math.abs(ten - n);
        double temp2 = Math.abs(ten - m);

        if (n >= 0 && m >= 0) {
            if (temp1 < temp2) {
                System.out.printf("Число n(%.2f) - ближайшее к 10\n", n);
            } else if (temp2 < temp1) {
                System.out.printf("Число m(%.2f) - ближайшее к 10\n", m);
            } else {
                System.out.println("Числа на равном расстоянии от 10");
            }
        } else {
            System.out.println("Введите положительные числа!");
        }

        //3. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
        // целое число в интервал (25;100) и сообщать результат на экран.
        System.out.println("Введите число");
        int d = scan.nextInt();

        if (d >= 5 && d <= 155) {
            if (d > 25 && d < 100) {
                System.out.println("Число в диапазоне (25; 100)");
            } else {
                System.out.println("Число не попало в диапазон (25; 100)");
            }
        } else {
            System.out.println("Введите числа в диапазоне [5; 155]");
        }

        //4. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
        // и его наибольшую цифру.
        int ranNum = rand.nextInt(899) + 100;
        int a = ranNum / 100;
        int c = (ranNum / 10) % 10;
        int b = ranNum % 10;

        if (a > b) {
            if(a > c) {
                System.out.printf("Наибольшее число  - a(%d)", a);
            } else {
                System.out.printf("Наибольшее число  - c(%d)", c);
            }
        } else {
            if (b > c) {
                System.out.printf("Наибольшее число  - b(%d)", b);
            } else {
                System.out.printf("Наибольшее число  - a(%d)", a);
            }
        }


        //5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
        // Создать программу, которая переставит числа в переменных таким образом,
        // чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

        //без массивов
//        int a1 = scan.nextInt();
//        int b1 = scan.nextInt();
//        int c1 = scan.nextInt();
//        int temp1;
//
//        if (a1 > b1) {
//            temp1 = a1;
//            a1 = b1;
//            b1 = temp1;
//        }
//        if (b1 > c1) {
//            temp1 = b1;
//            b1 = c1;
//            c1 =temp1;
//        }
//        if (a1 > b1) {
//            temp1 = a1;
//            a1 = b1;
//            b1 = temp1;
//        }
//        System.out.println(a1 + b1 + c1);



        System.out.println("Введите подряд 3 числа");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int temp = 0;
        //boolean isSorted = false;

//       while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    isSorted = false;
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //6. Создайте программу, выводящую на экран все четырёхзначные числа
        // последовательности 1000 1003 1006 1009 1012 1015 ….
        for (int i = 1000; i <= 10000; i = i + 3) {
            System.out.println(i);
        }

        //7. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

        int s = 1;
        System.out.println(s);
        for (int i = 0; i < 55; i++) {
            s += 2;
            System.out.println(s);
        }

        //8. Создайте программу, выводящую на экран все неотрицательные
        // элементы последовательности 90 85 80 75 70 65 60 ….
        for (int i = 90; i >= 0; i = i - 5) {
            System.out.println(i);
        }

        //9. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int s5 = 2;
        System.out.println(s);
        for (int i = 0; i < 20; i++) {
            s5 *= 2;
            System.out.println(s5);
        }

        //10. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
        System.out.println("Введите число");
        int userNum = scan.nextInt();
        int a2 = 1;

        for (int i = 1; i <= userNum; i++) {
            a2 *= i;
        }
        System.out.println(a2);

        //11. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        System.out.println("Введите число");
        int n3 = scan.nextInt();

        for (int i = 1; i <= n3; i++) {
            if (n3 % i == 0) {
                System.out.println(i);
            }
        }

        //P.S. Все переменные (значения переменных) вводим с клавиатуры.
        //P.S.S. Предусмотреть проверки на ввод - если нужны только положительные числа,
        // а пользователь ввел отрицательное, то говорим ему об этом и прекращаем работу программы.

    }
}
