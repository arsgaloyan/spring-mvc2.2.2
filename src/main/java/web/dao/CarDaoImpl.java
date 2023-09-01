package web.dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(List<Car> list, int count) {
        if (count <= 0 || count >= 5) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
