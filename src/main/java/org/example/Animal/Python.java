package org.example.Animal;

// Класс Python представляет питона
public class Python extends Reptile {
    // Конструктор класса Python принимает кличку животного
    // У класса Python вид животного по умолчанию "Python molurus"
    // У класса Python по умолчанию отсутствует яд
    public Python(String name) {
        super(name, "Python molurus", false);
    }

    // Метод makeSound возвращает строку звучания питона
    @Override
    public String makeSound() {
        return "Шипение!";
    }
}
