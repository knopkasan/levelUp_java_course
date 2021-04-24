package ru.levelup.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    /**
     * 2 задачка:
     * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО,
     * номер читательского билета, факультет, дата рождения, телефон.
     * Разработать программу, в которой создается массив объектов данного класса.
     * Перегрузить методы takeBook(), returnBook():
     * 1. takeBook, который будет принимать количество взятых книг.
     * Выводит на консоль сообщение "Петров В. В. взял 3 книги".
     * 2. takeBook, который будет принимать переменное количество названий книг.
     * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     * 3. takeBook, который будет принимать переменное количество объектов класса Book
     * (создать новый класс, содержащий имя и автора книги).
     * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     * 4. Аналогичным образом перегрузить метод returnBook().
     * Выводит на консоль сообщение "Петров В. В. вернул книги:
     * Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги"
     */

    String fio;
    String number;
    String faculty;
    String phoneNumber;

    public Reader(String fio, String number, String faculty, String phoneNumber) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
    }


    //Создаем массив объектов класса Reader
    public Reader[] fillBase(int numberOfPerson) {
        Scanner scan = new Scanner(System.in);
        Reader[] readerBase = new Reader[numberOfPerson];
        for (int i = 0; i < readerBase.length; i++) {
            System.out.printf("Введите ФИО читателя %d:\n", i);
            String personFio = scan.nextLine();

            System.out.println("Введите номер читательского билета:");
            String personNumber = scan.nextLine();

            System.out.println("Введите факультет:");
            String personFaculty = scan.nextLine();

            System.out.println("Введите телефонный номер:");
            String personPhoneNumber = scan.nextLine();

            readerBase[i] = new Reader(personFio, personNumber, personFaculty, personPhoneNumber);
        }
        return readerBase;
    }

    public void takeBook(int bookAmount) {
        System.out.printf("%s взял %d книг(и)\n", this.fio, bookAmount);
    }

    public void takeBook(String... bookName) {
        System.out.printf("%s взял книги: %s\n", this.fio, Arrays.toString(bookName));
    }

    public void takeBook(Book... books) {
        String[] res = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            res[i] = books[i].book;
        }

        System.out.printf("%s взял книги: %s\n", this.fio, Arrays.toString(res));
    }

    public void returnBook(int bookAmount) {
        System.out.printf("%s вернул %d книги\n", this.fio, bookAmount);
    }

    public void returnBook(String... bookName) {
        System.out.printf("%s вернул книги: %s\n", this.fio, Arrays.toString(bookName));
    }

    public void returnBook(Book... books) {
        String[] res = new String[books.length];
        for(int i = 0; i < books.length; i++) {
            res[i] = books[i].book;
        }

        System.out.printf("%s вернул книги: %s\n", this.fio, Arrays.toString(res));
    }
}
