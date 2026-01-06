package org.example.Employee;

// Абстрактный класс AbstractEmployee представляет работника зоопарка
public abstract class AbstractEmployee implements Employee {
    protected String name;
    protected String position;

    // Конструктор класса AbstractEmployee принимает имя сотрудника и позицию
    public AbstractEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Геттер getName возвращает имя сотрудника зоопарка
    @Override
    public String getName() {
        return name;
    }

    // Геттер getPosition возвращает позицию зоопарка
    @Override
    public String getPosition() {
        return position;
    }
}
