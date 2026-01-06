package org.example.Enclosure;
import org.example.Animal.Animal;

// Класс MammalEnclosure представляет вольер для млекопитающих
public class MammalEnclosure extends AbstractEnclosure {
    private final double temperature;

    // Конструктор класса MammalEnclosure принимает код вольера, площадь и температуру
    // Для класса MammalEnclosure тип вольера по умолчанию
    public MammalEnclosure(String code, double area, double temperature) {
        super(code, area, "Вольер для млекопитающих");
        this.temperature = temperature;
    }

    // Метод addAnimal добавляет животное в список животных вольера
    @Override
    public boolean addAnimal(Animal animal) {
        if (animal.getHabitatType().equals(getType()) && animals.size() < 5) {
            animals.add(animal);
            notifyObservers("Добавлено животное: " + animal.getName());
            return true;
        }
        return false;
    }

    // Метод removeAnimal удаляет животное из списка животных вольера
    @Override
    public boolean removeAnimal(Animal animal) {
        boolean removed = animals.remove(animal);
        if (removed) {
            notifyObservers("Removed animal: " + animal.getName());
        }
        return removed;
    }

    // Геттер getTemperature возвращает температуру вольера
    public double getTemperature() {
        return temperature;
    }
}
