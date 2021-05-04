package ru.levelup.lesson6;

public class Compare {

    public static void main(String[] args) {
        Superhero f = new Superhero();
        f.setNick("Wolverine");

        Superhero s = new Superhero();
        s.setNick("Cyclops");

        SuperheroComparator comparator = new SuperheroComparator();
        comparator.compareTwoRealObjects(f, s);

    }
}
