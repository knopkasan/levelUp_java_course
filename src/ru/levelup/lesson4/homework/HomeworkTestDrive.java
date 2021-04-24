package ru.levelup.lesson4.homework;

public class HomeworkTestDrive {
    public static void main(String[] args) {

        //Задание 1
        Phone mobile = new Phone("+70000000000", "Nokia", "0.5");
        Phone homePhone = new Phone("000-000-00-00", "LG", "1");
        Phone bigPhone = new Phone("1111(4567)", "-", "5");

        System.out.println("Номер телефона: " + mobile.number +
                ", модель: " + mobile.model +
                ", вес: " + mobile.weight);

        System.out.println("Номер телефона: " + homePhone.number +
                ", модель: " + homePhone.model +
                ", вес: " + homePhone.weight);

        System.out.println("Номер телефона: " + bigPhone.number +
                ", модель: " + bigPhone.model +
                ", вес: " + bigPhone.weight);


        System.out.println(mobile.getNumber());
        mobile.receiveCall("Елена");

        System.out.println(homePhone.getNumber());
        homePhone.receiveCall("Мама");
        homePhone.receiveCall("Слава", "34567890");

        System.out.println(bigPhone.getNumber());
        bigPhone.receiveCall("Таня");

        String[] numbers = new String[]{"34567890", "7565467", "00000000"};
        mobile.sendMessage(numbers);


        //Задание 2
        Reader testReader = new Reader("Базилькин Л.Ф.", "3422-5", "L", "23043000");
        testReader.takeBook("Золотой Теленок", "Война и Мир", "Словарь");

        testReader.returnBook(new Book("A.C. Пушкин", "Руслан и Людмила"),
                              new Book("Л.Н. Толстой", "После Бала"));
        testReader.takeBook(5);
        testReader.returnBook("Философия Java");

        Reader[] newReader = testReader.fillBase(2);

        //задание 3

        Animal[] queueToVet = new Animal[] {new Cat("рыба", "везде", "мэйн-кун"),
                                            new Dog("мясо", "дом", "крупная"),
                                            new Horse("сено", "прерии", "белая в яблоках")};

        Veterinary vet = new Veterinary();
        for (Animal animal: queueToVet) {
            vet.treatAnimal(animal);
        }
    }
}
