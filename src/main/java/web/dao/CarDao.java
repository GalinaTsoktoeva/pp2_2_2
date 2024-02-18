package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class CarDao {
    private final Map<Long, Car> cars = new HashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    public CarDao() {
        saveCar(new Car("Toyota", 325, "TO456AM"));
        saveCar(new Car("Mitsubishi", 4532, "FA567RE"));
        saveCar(new Car("Lada", 89, "OR269ZA"));
        saveCar(new Car("Kamaz", 120, "WE764UE"));
        saveCar(new Car("Honda", 678, "DA562NE"));
    }
    public List<Car> getAllCar() {
        return new ArrayList<>(cars.values());
    }
    public Car findCarById(Long id) {
        return cars.get(id);
    }
    public Car saveCar(Car car) {
        if (car.getId() == null) {
            car.setId(sequence.getAndIncrement());
        }
        cars.put(car.getId(), car);
        return car;
    }
}
