package org.example.Animal;

// Класс Bird представляет птицу
public class Bird extends AbstractAnimal {
    private final double wingspan;

    // Конструктор класса Bird принимает кличку животного, название вида и размах крыльев птицы
    // Для класса Bird среда обитания по умолчанию "Птичник"
    public Bird(String name, String species, double wingspan) {
        super(name, species, "Птичник");
        this.wingspan = wingspan;
    }

    // Метод makeSound возвращает строку звучания птицы
    @Override
    public String makeSound() {
        return "Чириканье";
    }

    // Геттер getWingspan возвращает размах крыльев птицы
    public double getWingspan() {
        return wingspan;
    }
}
