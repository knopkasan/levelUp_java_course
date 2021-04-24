package ru.levelup.lesson4;

import javax.xml.bind.SchemaOutputResolver;

public class Phone {

    /**
     * 1 задачка:
     * Класс Phone.
     * 1. Создайте класс Phone, который содержит переменные number, model и weight.
     * 2. Создайте три экземпляра этого класса.
     * 3. Выведите на консоль значения их переменных.
     * 4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
     * Выводит на консоль сообщение “Звонит {name}”.
     * getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
     * 5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
     * переменных класса - number, model и weight.
     * 6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
     * number, model.
     * 7. Добавить конструктор без параметров.
     * 8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
     * 9. Добавьте перегруженный метод receiveCall, который принимает два параметра -
     * имя звонящего и номер телефона звонящего. Вызвать этот метод.
     * 10. Создать метод sendMessages c массивом строк (String[]) в качестве одного из параметров.
     * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
     * Метод выводит на консоль номера этих телефонов.
     */
    String number;
    String model;
    String weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера телефона " + number);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers ) {
            System.out.println(number);
        }
    }
}
