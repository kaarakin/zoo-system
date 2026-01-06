package org.example;
import org.example.Animal.*;
import org.example.Enclosure.*;
import org.example.Employee.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем систему управления зоопарком
        ZooManagementSystem zoo = new ZooManagementSystem();

        // Создаем животных
        Animal liger = new Liger("Геркулес");
        Animal flamingo = new Flamingo("Роза");
        Animal varanus = new Varanus("Джек");
        Animal python = new Python("Канат");
        Animal nakedMoleRat = new NakedMoleRat("Малыш");

        // Добавляем животных в систему
        zoo.addAnimal(liger);
        zoo.addAnimal(flamingo);
        zoo.addAnimal(varanus);
        zoo.addAnimal(python);
        zoo.addAnimal(nakedMoleRat);

        // Создаем вольеры
        Enclosure mammalEnclosure = new MammalEnclosure("МЛЕК-001", 50.0, 25.0);
        Enclosure aviary = new Aviary("ПТИЧ-001", 30.0, 10.0);
        Enclosure terrarium = new Terrarium("ТЕРР-001", 20.0, 70.0);

        // Добавляем вольеры в систему
        zoo.addEnclosure(mammalEnclosure);
        zoo.addEnclosure(aviary);
        zoo.addEnclosure(terrarium);

        // Создаем сотрудников
        Zookeeper keeper = new Zookeeper("Евгения Петрова");
        Veterinarian vet = new Veterinarian("Николай Иванов");
        Guide guide = new Guide("Дарья Соболева");

        // Добавляем сотрудников в систему
        zoo.addEmployee(keeper);
        zoo.addEmployee(vet);
        zoo.addEmployee(guide);

        // Назначаем вольеры смотрителю
        keeper.assignEnclosure(mammalEnclosure);
        keeper.assignEnclosure(aviary);
        keeper.assignEnclosure(terrarium);

        // Добавляем животных к ветеринару
        vet.addPatient(liger);
        vet.addPatient(nakedMoleRat);
        vet.addPatient(varanus);

        // Добавляем маршруты гиду
        guide.addTourRoute("Млечный путь");
        guide.addTourRoute("Птичий рай");

        // Подписываем ветеринара на уведомления из вольеров
        mammalEnclosure.addObserver(vet);
        aviary.addObserver(vet);
        terrarium.addObserver(vet);

        // Размещаем животных в вольерах
        zoo.placeAnimalInEnclosure(liger, mammalEnclosure);
        zoo.placeAnimalInEnclosure(nakedMoleRat, mammalEnclosure);
        zoo.placeAnimalInEnclosure(flamingo, aviary);
        zoo.placeAnimalInEnclosure(varanus, terrarium);
        zoo.placeAnimalInEnclosure(python, terrarium);

        // Выполняем ежедневные операции
        zoo.performDailyOperations();

        // Выводим информацию о системе
        zoo.listAllAnimals();
        zoo.listAllEnclosures();

        // Поиск животных по виду
        System.out.println("\n=== Поиск лигра ===");
        List<Animal> lions = zoo.findAnimalsBySpecies("leo");
        for (Animal l : lions) {
            System.out.println("Найдено: " + l.getName() + " - " + l.getSpecies());
        }
    }
}
