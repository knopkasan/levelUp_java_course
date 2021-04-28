package ru.levelup.lesson5;

import java.util.Objects;

public class Laptop {
    private String brand;
    private int ram;
    private double cpu;

    public Laptop(String brand, int ram, double cpu) {
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//повторяет логику equals из object
        //v1
        //instanceof
        //<obj>instanceof <Class> -> true, если obj относится к классу Class. иначе false
        //if (!(o instanceof Laptop)) return false;//только если o - !подкласс! Laptop

        //v2
        if (o == null || getClass() != o.getClass()) return false;

        Laptop second = (Laptop) o;//ClassCastException, если передаем не связанный с лэптоп класс
        return ram == second.ram && //NullPointerException(NPE) Null можно привести к любому типу
                Objects.equals(brand, second.brand);//NPE - fixed
    }

    @Override
    public int hashCode() {
//        int result = 13;
//        result += 31 * result + ram;
//        result += 31 * result + brand.hashCode();
//        return result;
        return Objects.hash(ram, brand);
    }


}
