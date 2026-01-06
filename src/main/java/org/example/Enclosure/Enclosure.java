package org.example.Enclosure;
import org.example.Animal.Animal;
import org.example.Employee.Observer;
import java.util.List;

// Интерфейс Enclosure предоставляет интерфейс вольера
public interface Enclosure {
    String getCode();
    double getArea();
    String getType();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    boolean addAnimal(Animal animal);
    boolean removeAnimal(Animal animal);
    List<Animal> getAnimals();
}
