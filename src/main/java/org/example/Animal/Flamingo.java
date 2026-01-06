package org.example.Animal;

// Класс Flamingo представляет фламинго
public class Flamingo extends Bird {
    // Конструктор класса Flamingo принимает кличку животного
    // У класса Flamingo вид животного по умолчанию "Phoenicopterus"
    // У класса Flamingo размах крыльев по умолчанию 1.6
    public Flamingo(String name) {
        super(name, "Phoenicopterus", 1.6);
    }

    // Метод makeSound возвращает строку звучания фламинго
    @Override
    public String makeSound() {
        return "Гоготание!";
    }
}
