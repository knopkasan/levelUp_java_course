package ru.levelup.lesson5.homework;

public class BaseFilter {
    /**
     * Создайте класс BaseFilter и в нем метод boolean filter(Object object).
     * Этот метод должен внутри просто возвращать false всегда.
     * После этого, создайте класс FilterService,
     * у которого есть метод Object[] filterArray(Object[] object,
     * BaseFilter baseFilter). В этом методе у вас будет фильтрация массива.
     * Фильтрация массива будет основа на классах, которые будет расширять класс BaseFilter.
     * <p>
     * Вы должны создать наследника класса BaseFilter и переопределить метод filter
     * (логика фильтрации будет по вашему желанию).
     * <p>
     * Что в итоге должно быть:
     * 1. Создаете массив MyClass[] arr = new MyClass[];
     * 2. Создаете объект класса FilterService
     * 3. Создаете объект класса, который расширяет BaseFilter baseFilter = new MyFilter().
     * 4. Вызываете MyClass[] newArray = (MyClass[]) filterSerivce.filterArray(arr, baseFilter);
     * 5. Проверить, что в новом массиве остались только те значения,
     * для которых baseFilter.filter() вернул true.
     *
     * @param object
     * @return
     */
    boolean filter(Object object) {
        return false;
    }
}
