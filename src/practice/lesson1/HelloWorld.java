package practice.lesson1;

public class HelloWorld {
    //Точка входа
    public static void main(String[] args) {
        System.out.println("Hello World!"); //вывести в консоль строку

        //переменная
        //тип переменной <имя переменной>
        int first; //объявили переменную
        first = 5; //записали значение

        int second = 6; //инициализация переменной = объявление переменной + запись значения

        int result = second * first;

        System.out.println(result);

        int sum;
        sum = result + second;

        //String + другой тип > строка
        System.out.println("Sum" + sum);

        int a = 10;
        int b = 10;

        System.out.println();
    }
}
