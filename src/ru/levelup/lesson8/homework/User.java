package ru.levelup.lesson8.homework;

import java.util.*;

public class User {
    /**
     * 1 задачка:
     * Дан класс User со следующими полями (username, email, password),
     * модифицировать его не можем (нет сеттеров и существует только один конструктор,
     * который принимает сразу все поля). Нужно написать метод
     * List<User> findDuplicates(Collection<User> collA, Collection<User> collB);
     * который возвращает дубликаты: пользователей, которые есть в обеих коллекциях.
     * Одинаковыми считаем юзеров, у которых совпадают все 3 поля.
     */

    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //версия нормального человека?
    public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {
       List<User> duplicates = new ArrayList<>(collA);
        duplicates.retainAll(collB); //оставляет в коллекции только те элементы,
        // которые есть в другой коллекции
       return duplicates;
    }


    //версия курильщика
    public static List<User> findDuplicates2(Collection<User> collA, Collection<User> collB) {
        List<User> duplicates = new ArrayList<>();

        for (User userA: collA) {
            for (User userB : collB)
            {
                if(userA.equals(userB)) {
                    duplicates.add(userA);
                }
            }
        }

        return duplicates;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
