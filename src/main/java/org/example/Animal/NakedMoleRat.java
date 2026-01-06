package org.example.Animal;

// Класс NakedMoleRat представляет голого землекопа
public class NakedMoleRat extends Mammal {
    // Конструктор класса NakedMoleRat принимает кличку животного
    // У класса NakedMoleRat вид животного по умолчанию "Heterocephalus glaber"
    // У класса NakedMoleRat по умолчанию отсутствует шерсть
    public NakedMoleRat(String name) {
        super(name, "Heterocephalus glaber", false);
    }

    // Метод makeSound возвращает строку звучания голого землекопа
    @Override
    public String makeSound() {
        return "Писк!";
    }
}