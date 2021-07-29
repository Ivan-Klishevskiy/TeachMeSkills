package Unit6;

public class Cargo extends AbstractGround {
    int loadCapacity;

    public Cargo(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuel, int loadCapacity) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuel);
        this.loadCapacity = loadCapacity;
    }


    public void checkLoad(int weight) {
        if (loadCapacity >= weight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше ");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" loadCapacity=" + loadCapacity);
    }
}
