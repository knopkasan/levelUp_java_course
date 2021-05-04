package ru.levelup.lesson6;

//AK - может содержать абстрактные методы
//АК - нельзя создать объект абстрактного класса
//может иметь обычные методы и поля
//наследний будет обязан переопределить ВСЕ абстрактные методы
public abstract class ObjectComparator {

    //< 0 - first < second
    //0 - first = second
    //> 0 - first > second
    protected abstract int compare(Object first, Object second);

    public int compareTwoRealObjects(Object first, Object second) {
        //любое значение > null
        if (first == second) return 0;
        if (first == null) return -1;
        if (second == null) return 1;

        return compare(first, second);
    }
}
