package org.example;
import org.example.Animal.Animal;
import org.example.Employee.Employee;
import org.example.Enclosure.Enclosure;
import java.util.ArrayList;
import java.util.List;

// Класс ZooManagementSystem представляет основной класс управления системой зоопарка
public class ZooManagementSystem {
    private List<Animal> animals;
    private List<Employee> employees;
    private List<Enclosure> enclosures;

    // Конструктор класса ZooManagementSystem
    public ZooManagementSystem() {
        this.animals = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.enclosures = new ArrayList<>();
    }

    // Метод addAnimal добавляет животное в список животных зоопарка
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal.getName());
    }

    // Метод addEmployee добавляет работника в список работников зоопарка
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Добавлен работник: " + employee.getName());
    }

    // Метод addEnclosure добавляет вольер в список вольеров зоопарка
    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
        System.out.println("Добавлен вольер: " + enclosure.getCode());
    }

    // Метод placeAnimalInEnclosure помещает животное animal в вольер enclosure
    // Возвращает true - если успешно
    // Возвращает false - если не успешно
    public boolean placeAnimalInEnclosure(Animal animal, Enclosure enclosure) {
        if (enclosure.addAnimal(animal)) {
            System.out.println("Поместили " + animal.getName() + " в вольер " + enclosure.getCode());
            return true;
        }
        System.out.println("Не удалось поместить " + animal.getName() + " в вольер " + enclosure.getCode());
        return false;
    }

    // Метод performDailyOperations выполняет обязанности всех работников зоопарка
    public void performDailyOperations() {
        System.out.println("\n=== Выполнение обязанностей работников ===");
        for (Employee employee : employees) {
            employee.performDuties();
        }
    }

    // Метод listAllAnimals выводит список всех животных зоопарка
    public void listAllAnimals() {
        System.out.println("\n=== Животные зоопарка ===");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getSpecies() + " - Звук: " + animal.makeSound());
        }
    }

    // Метод listAllEnclosures выводит список всех вольеров зоопарка
    public void listAllEnclosures() {
        System.out.println("\n=== Вольеры зоопарка ===");
        for (Enclosure enclosure : enclosures) {
            System.out.println(enclosure.getCode() + " - " + enclosure.getType() +
                    " - Площадь: " + enclosure.getArea() +
                    " - Животные: " + enclosure.getAnimals().size());
        }
    }

    // Метод findAnimalsBySpecies выполняет поиск животного по названию вида species и возвращает список животных
    public List<Animal> findAnimalsBySpecies(String species) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getSpecies().toLowerCase().contains(species.toLowerCase())) {
                result.add(animal);
            }
        }
        return result;
    }

    // Геттер getAnimals возвращает список животных зоопарка
    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    // Геттер getEmployees возвращает список работников зоопарка
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    // Геттер getEnclosures возвращает список вольеров зоопарка
    public List<Enclosure> getEnclosures() {
        return new ArrayList<>(enclosures);
    }
}
