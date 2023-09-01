package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();


    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCars
            , Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 2015));
        cars.add(new Car("BMW", "4", 2014));
        cars.add(new Car("BMW", "5", 2019));
        cars.add(new Car("BMW", "6", 2020));
        cars.add(new Car("BMW", "7", 2021));

        cars = carService.getCars(cars, numberOfCars);
        model.addAttribute("cars", cars);


        return "cars";
    }
}
