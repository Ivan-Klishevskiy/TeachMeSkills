package AllClassWorks.ClassWork13.Task2;

public class Start {
    private static void printTest(Car car, CheckCar checkCar) {
        if (checkCar.test(car)) {
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        Car audiA3 = new Car("AudiA3", true, true);
        Car audiA6 = new Car("AudiA6", true, false);
        printTest(audiA3, c -> c.getIsFullDrive());
        printTest(audiA3, c -> c.getIsGusEngine());
        printTest(audiA6, c -> c.getIsFullDrive());
        printTest(audiA6, c -> c.getIsGusEngine());
    }
}
