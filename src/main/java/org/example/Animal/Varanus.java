package org.example.Animal;

// Класс Varanus представляет варана
public class Varanus extends Reptile {
    // Конструктор класса Varanus принимает кличку животного
    // У класса Varanus вид животного по умолчанию "Varanus"
    // У класса Varanus по умолчанию присутствует яд
    public Varanus(String name) {
        super(name, "Varanus", true);
    }

    // Метод makeSound возвращает строку звучания варана
    @Override
    public String makeSound() {
        return "Щелканье!";
    }
}
