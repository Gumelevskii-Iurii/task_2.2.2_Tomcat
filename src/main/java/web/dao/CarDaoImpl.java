package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static int CARS_COUNT;
    private static final List<Car> carsList = new ArrayList<>();

    public CarDaoImpl() {

        carsList.add(new Car(++CARS_COUNT, "Porshe", 1));
        carsList.add(new Car(++CARS_COUNT, "Bike", 0));
        carsList.add(new Car(++CARS_COUNT, "Scooter", 0));
        carsList.add(new Car(++CARS_COUNT, "Lada", 9));
        carsList.add(new Car(++CARS_COUNT, "Kamaz", 5));
    }

    @Override
    public List<Car> getCarsCount(int count) {
        if (count == 0 || count > 5) return carsList;
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
    
}


