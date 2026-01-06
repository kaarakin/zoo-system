package org.example.Enclosure;
import org.example.Animal.Animal;
import org.example.Employee.Observer;
import java.util.ArrayList;
import java.util.List;

// Абстрактный класс AbstractEnclosure представляет вольер
public abstract class AbstractEnclosure implements Enclosure {
    protected String code;
    protected double area;
    protected String type;
    protected List<Animal> animals;
    protected List<Observer> observers;

    // Конструктор класса AbstractEnclosure принимает код вольера, площадь и тип
    public AbstractEnclosure(String code, double area, String type) {
        this.code = code;
        this.area = area;
        this.type = type;
        this.animals = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Геттер getCode возвращает код вольера
    @Override
    public String getCode() {
        return code;
    }

    // Геттер getArea возвращает площадь вольера
    @Override
    public double getArea() {
        return area;
    }

    // Геттер getType возвращает тип вольера
    @Override
    public String getType() {
        return type;
    }

    // Геттер getAnimals возвращает список животных
    @Override
    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    // Метод addObserver добавляет наблюдателя в список наблюдателей
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод removeObserver удаляет наблюдателя из списка наблюдателей
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод notifyObservers оповещает наблюдателей из списка наблюдателей
    protected void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update("Вольер " + code + ": " + message);
        }
    }
}
