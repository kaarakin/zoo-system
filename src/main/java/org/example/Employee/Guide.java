package org.example.Employee;
import java.util.ArrayList;
import java.util.List;

// Класс Guide представляет гида зоопарка
public class Guide extends AbstractEmployee {
    private List<String> tourRoutes;

    // Конструктор класса Guide принимает имя сотрудника
    // Для класса Guide позиция сотрудника по умолчанию "Гид"
    public Guide(String name) {
        super(name, "Гид");
        this.tourRoutes = new ArrayList<>();
    }

    // Метод performDuties позволяет выполнить обязанности сотрудника
    @Override
    public void performDuties() {
        System.out.println(name + " планирует тур:");
        for (String route : tourRoutes) {
            System.out.println("  - Маршрут тура: " + route);
        }
    }

    // Метод addTourRoute добавляет маршрут в список маршрутов тура
    public void addTourRoute(String route) {
        tourRoutes.add(route);
    }
}
