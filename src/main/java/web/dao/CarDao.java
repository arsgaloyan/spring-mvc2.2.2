package web.dao;

import web.model.Car;

import java.util.List;


public interface CarDao {
    List<Car> addCars();
    List<Car> getCars(List<Car> cars, int count);
}
