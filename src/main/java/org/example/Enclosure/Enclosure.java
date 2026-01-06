package org.example.Enclosure;
import org.example.Animal.Animal;
import java.util.List;

// Интерфейс Enclosure предоставляет интерфейс вольера
public interface Enclosure {
    String getCode();
    double getArea();
    String getType();
    boolean addAnimal(Animal animal);
    boolean removeAnimal(Animal animal);
    List<Animal> getAnimals();
}
