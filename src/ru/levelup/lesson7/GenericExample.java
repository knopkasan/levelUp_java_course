package ru.levelup.lesson7;

public class GenericExample {

    public static void main(String[] args) {
        //компилятор проверяет одинаковость типов, потом стирает типы и меняет на обджект
        GenericClass<String> stringGenericClass = new GenericClass<>();
        stringGenericClass.changeField("Some");
        //stringGenericClass.changeField(44);  - нельзя
        String value = stringGenericClass.getField();
        System.out.println(value);

        //generic работают только со ссылочными типами
        //для каждого примитивного типа есть точно такой же тип(8 классов), только ссылочный (класс-обертка)

        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        integerGenericClass.changeField(54);

        //boxing - упаковка: autoboxing
        //unboxing  - распаковака: autounboxing
        int intValue = 5;
        Integer integerValue = Integer.valueOf(intValue); //упаковка - из примитива в объект

        int fromObjectValue = integerValue.intValue();//распаковка - из объекта в примитив

        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 129;
        Integer i4 = 129;

        System.out.println(i1 == 12); //true . тут будет кэш integer'а от -128 до 127
        System.out.println(i3 == i4);//false
     }

}
