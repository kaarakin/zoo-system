package org.example.Animal;

// Класс Reptile представляет рептилию
public class Reptile extends AbstractAnimal {
    private final boolean isVenomous;

    // Конструктор класса Reptile принимает кличку животного, название вида и наличие яда у рептилии
    // Для класса Reptile среда обитания по умолчанию "Террариум"
    public Reptile(String name, String species, boolean isVenomous) {
        super(name, species, "Террариум");
        this.isVenomous = isVenomous;
    }

    // Метод makeSound возвращает строку звучания рептилии
    @Override
    public String makeSound() {
        return "Шипение рептилии";
    }

    // Геттер isVenomous возвращает наличие яда у рептилии
    public boolean isVenomous() {
        return isVenomous;
    }
}