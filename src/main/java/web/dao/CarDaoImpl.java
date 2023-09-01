package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 2015));
        cars.add(new Car("BMW", "4", 2014));
        cars.add(new Car("BMW", "5", 2019));
        cars.add(new Car("BMW", "6", 2020));
        cars.add(new Car("BMW", "7", 2021));

        return cars;
    }

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count <= 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
