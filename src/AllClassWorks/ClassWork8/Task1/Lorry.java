package AllClassWorks.ClassWork8.Task1;

import AllClassWorks.ClassWork8.Task1.com.company.details.Engine;
import AllClassWorks.ClassWork8.Task1.com.company.professions.Driver;
import AllClassWorks.ClassWork8.Task1.com.company.vehicles.Car;

public class Lorry extends Car {
    private int loadCapacity;

    public Lorry(String brandCar, String typeCar, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(brandCar, typeCar, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }
}
