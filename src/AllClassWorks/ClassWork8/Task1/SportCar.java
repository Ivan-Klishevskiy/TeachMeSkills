package AllClassWorks.ClassWork8.Task1;

import AllClassWorks.ClassWork8.Task1.com.company.details.Engine;
import AllClassWorks.ClassWork8.Task1.com.company.professions.Driver;
import AllClassWorks.ClassWork8.Task1.com.company.vehicles.Car;

public class SportCar extends Car {
    private int maximumSpeed;

    public SportCar(String brandCar, String typeCar, int weight, Driver driver, Engine engine, int maximumSpeed) {
        super(brandCar, typeCar, weight, driver, engine);
        this.maximumSpeed = maximumSpeed;
    }
}
