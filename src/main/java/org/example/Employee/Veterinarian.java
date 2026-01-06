package org.example.Employee;
import org.example.Animal.Animal;
import java.util.ArrayList;
import java.util.List;

// Класс Veterinarian представляет ветеринара
public class Veterinarian extends AbstractEmployee implements Observer {
    private List<Animal> patients;

    // Конструктор класса Veterinarian принимает имя сотрудника
    // Для класса Veterinarian позиция сотрудника по умолчанию "Ветеринар"
    public Veterinarian(String name) {
        super(name, "Ветеринар");
        this.patients = new ArrayList<>();
    }

    // Метод performDuties позволяет выполнить обязанности сотрудника
    @Override
    public void performDuties() {
        System.out.println(name + " проводит осмотр:");
        for (Animal animal : patients) {
            System.out.println("  - Осматривает " + animal.getName());
            System.out.println("    Звук: " + animal.makeSound());
        }
    }

    // Метод update позволяет получить оповещение message
    @Override
    public void update(String message) {
        System.out.println("Ветеринар " + name + " получил оповещение: " + message);
    }

    // Метод addPatient добавляет животное в список пациентов
    public void addPatient(Animal animal) {
        patients.add(animal);
    }
}