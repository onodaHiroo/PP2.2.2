package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW M3", 228, (short) 200));
        cars.add(new Car("Porsche Type 205", 1488, (short) 52));
        cars.add(new Car("OKA", 1337, (short) -100));
        cars.add(new Car("Daewoo Matiz", 1312, (short) 69));
        cars.add(new Car("OperPlug Sueta Telejka", 666, (short) 1000));
    }

    @Override
    public List<Car> getListOfCars(int count) {
        if ((count > 0) && (count < cars.size())) {
            return cars.subList(0, count);
        } else return cars;
    }

}
