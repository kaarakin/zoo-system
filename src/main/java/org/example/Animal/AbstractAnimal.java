package org.example.Animal;

// Абстрактный класс AbstractAnimal представляет базовый класс животного
public abstract class AbstractAnimal implements Animal {
    protected String name;
    protected String species;
    protected String habitatType;

    // Конструктор класса AbstractAnimal принимает кличку животного, название вида и среду обитания
    public AbstractAnimal(String name, String species, String habitatType) {
        this.name = name;
        this.species = species;
        this.habitatType = habitatType;
    }

    // Геттер getName возвращает кличку животного
    @Override
    public String getName() {
        return name;
    }

    // Геттер getSpecies возвращает название вида животного
    @Override
    public String getSpecies() {
        return species;
    }

    // Геттер getHabitatType возвращает среду обитания животного
    @Override
    public String getHabitatType() {
        return habitatType;
    }
}
