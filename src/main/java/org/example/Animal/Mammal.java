package org.example.Animal;

// Класс Mammal представляет млекопитающего
public class Mammal extends AbstractAnimal {
    private final boolean hasFur;

    // Конструктор класса Mammal принимает кличку животного, название вида и наличие шерсти у животного
    // Для класса Mammal среда обитания по умолчанию "Вольер для млекопитающих"
    public Mammal(String name, String species, boolean hasFur) {
        super(name, species, "Вольер для млекопитающих");
        this.hasFur = hasFur;
    }

    // Метод makeSound возвращает строку звучания млекопитающего
    @Override
    public String makeSound() {
        return "Звук млекопитающего";
    }

    // Геттер hasFur возвращает наличие шерсти у животного
    public boolean hasFur() {
        return hasFur;
    }
}
