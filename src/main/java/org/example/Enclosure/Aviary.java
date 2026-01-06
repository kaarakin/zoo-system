package org.example.Enclosure;
import org.example.Animal.Animal;

// Класс Aviary представляет птичник
public class Aviary extends AbstractEnclosure {
    private final double height;

    // Конструктор класса Aviary принимает код вольера, площадь и высоту
    // Для класса Aviary тип вольера по умолчанию "Птичник"
    public Aviary(String code, double area, double height) {
        super(code, area, "Птичник");
        this.height = height;
    }

    // Метод addAnimal добавляет животное в список животных вольера
    @Override
    public boolean addAnimal(Animal animal) {
        if (animal.getHabitatType().equals(getType()) && animals.size() < 10) {
            animals.add(animal);
            notifyObservers("Добавлена птица: " + animal.getName());
            return true;
        }
        return false;
    }

    // Метод removeAnimal удаляет животное из списка животных вольера
    @Override
    public boolean removeAnimal(Animal animal) {
        boolean removed = animals.remove(animal);
        if (removed) {
            notifyObservers("Удалена птица: " + animal.getName());
        }
        return removed;
    }

    // Геттер getHeight возвращает высоту птичника
    public double getHeight() {
        return height;
    }
}
