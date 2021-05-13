package ru.levelup.lesson8.homework;

import java.util.*;

public class TestDrive {
    public static void main(String[] args) {

        ArrayList<User> users1 = new ArrayList<>();
        ArrayList<User> users2 = new ArrayList<>();

        users1.add(new User("test", "test@test.test", "123456"));
        users1.add(new User("-", "happyThreeFriends@movie.com", "qwerty"));
        users1.add(new User("proxy", "NaN", "0"));


        users2.add(new User("test", "test@test.test", "123456"));
        users2.add(new User("Admin", "happyThreeFriends@movie.com", "qwerty"));
        users2.add(new User("proxy", "NaN", "0"));
        users2.add(new User("test", "netest@test.ru", "123456"));

        List<User> result = User.findDuplicates(users1, users2);

        List<User> result2 = User.findDuplicates2(users1, users2);

        for (User user : result) {
            System.out.println(user.toString());
        }
        System.out.println();

        for (User user : result2) {
            System.out.println(user.toString());
        }
        System.out.println();

        SetExample ex = new SetExample();
        Set<Object> us1 = new HashSet<>(users1);
        Set<Object> us2 = new HashSet<>(users2);

        Set<Object> wowIntersection = ex.intersect(us1, us2);
        Set<Object> wowUnion = ex.union(us1, us2);

        for (Object user : wowIntersection) {
            System.out.println(user.toString());
        }
        System.out.println();

        for (Object user : wowUnion) {
            System.out.println(user.toString());
        }
        System.out.println();
    }
}
