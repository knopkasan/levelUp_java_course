package ru.levelup.lesson6;

public class SuperheroComparator extends ObjectComparator {


    @Override
    public int compare(Object first, Object second) {
        Superhero firstHero = (Superhero) first;
        Superhero secondHero = (Superhero) second;

        return firstHero.getNick().compareToIgnoreCase(secondHero.getNick());
    }
}
