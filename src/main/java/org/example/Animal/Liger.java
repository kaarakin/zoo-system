package org.example.Animal;

// Класс Liger представляет лигра (гибрид между львом-самцом и тигрицей-самкой)
public class Liger extends Mammal {
    // Конструктор класса Liger принимает кличку животного
    // У класса Liger вид животного по умолчанию "Panthera leo ♂ x Panthera tigris ♀"
    // У класса Liger по умолчанию имеется шерсть
    public Liger(String name) {
        super(name, "Panthera leo ♂ x Panthera tigris ♀", true);
    }

    // Метод makeSound возвращает строку звучания лигра
    @Override
    public String makeSound() {
        return "Рычание!";
    }
}
