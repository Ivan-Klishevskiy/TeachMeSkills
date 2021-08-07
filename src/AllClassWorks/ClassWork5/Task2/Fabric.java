package AllClassWorks.classwork5.Task2;

public class Fabric {
    public static void main(String[] args) {
        Road road = new Road();
        Car car = new Car("Tesla", 89);
        Car car2 = new Car("BMW", 40);
        road.run(car);
        road.run(car2);
    }
}
