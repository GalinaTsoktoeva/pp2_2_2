package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarDao carDao = new CarDao();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> cars = carDao.getAllCar();
        List<Car> limitCar = CarService.limitList(cars, allCars);
        model.addAttribute("cars", limitCar);
        return "cars";
    }
}
