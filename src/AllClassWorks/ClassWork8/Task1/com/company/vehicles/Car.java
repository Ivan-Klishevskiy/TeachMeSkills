package AllClassWorks.ClassWork8.Task1.com.company.vehicles;

import AllClassWorks.ClassWork8.Task1.com.company.details.Engine;
import AllClassWorks.ClassWork8.Task1.com.company.professions.Driver;

public class Car {
    private String brandCar;
    private String typeCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brandCar, String typeCar, int weight, Driver driver, Engine engine) {
        this.brandCar = brandCar;
        this.typeCar = typeCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали ");
    }

    public void stop(){
        System.out.println("Останавливаемся ");
    }

    public void turnRight(){
        System.out.println("Поворот направо ");
    }

    public void turnLeft(){
        System.out.println("Поворот налево ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", typeCar='" + typeCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
