package org.example.Employee;
import org.example.Animal.Animal;
import org.example.Enclosure.Enclosure;
import java.util.ArrayList;
import java.util.List;

// Класс Zookeeper представляет смотрителя зоопарка
public class Zookeeper extends AbstractEmployee {
    private List<Enclosure> assignedEnclosures;

    // Конструктор класса Zookeeper принимает имя сотрудника
    // Для класса Zookeeper позиция сотрудника по умолчанию "Смотритель"
    public Zookeeper(String name) {
        super(name, "Смотритель");
        this.assignedEnclosures = new ArrayList<>();
    }

    // Метод performDuties позволяет выполнить обязанности сотрудника
    @Override
    public void performDuties() {
        System.out.println(name + " кормит животных и очищает вольеры:");
        for (Enclosure enclosure : assignedEnclosures) {
            System.out.println("  - Обслуживает вольер: " + enclosure.getCode());
            for (Animal animal : enclosure.getAnimals()) {
                System.out.println("    * Кормит " + animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
    }

    // Метод assignEnclosure добавляет вольер в список закрепленных за сотрудником
    public void assignEnclosure(Enclosure enclosure) {
        assignedEnclosures.add(enclosure);
    }

    // Геттер getAssignedEnclosures возвращает список вольеров, закрепленных за сотрудником
    public List<Enclosure> getAssignedEnclosures() {
        return new ArrayList<>(assignedEnclosures);
    }
}
