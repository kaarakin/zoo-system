package org.example.Enclosure;
import org.example.Animal.Animal;

// Класс Terrarium представляет террариум
public class Terrarium extends AbstractEnclosure {
    private final double humidity;

    // Конструктор класса Terrarium принимает код вольера, площадь и влажность
    // Для класса Terrarium тип вольера по умолчанию "Террариум"
    public Terrarium(String code, double area, double humidity) {
        super(code, area, "Террариум");
        this.humidity = humidity;
    }

    // Метод addAnimal добавляет животное в список животных вольера
    @Override
    public boolean addAnimal(Animal animal) {
        if (animal.getHabitatType().equals(getType()) && animals.size() < 3) {
            animals.add(animal);
            notifyObservers("Добавлена рептилия: " + animal.getName());
            return true;
        }
        return false;
    }

    // Метод removeAnimal удаляет животное из списка животных вольера
    @Override
    public boolean removeAnimal(Animal animal) {
        boolean removed = animals.remove(animal);
        if (removed) {
            notifyObservers("Удалена рептилия: " + animal.getName());
        }
        return removed;
    }

    // Геттер getHumidity возвращает влажность террариума
    public double getHumidity() {
        return humidity;
    }
}
