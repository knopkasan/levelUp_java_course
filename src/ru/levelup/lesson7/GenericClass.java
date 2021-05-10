package ru.levelup.lesson7;

//generic class - параметризированный класс
public class GenericClass<TYPE> {

    private TYPE field;


    public void changeField(TYPE field) {
        //field = new TYPE(); - так делать нельзя
        this.field = field;
    }

    public TYPE getField() {
        return field;
    }
}
