package Unit6;

public abstract class AbstractGround extends AbstractTransport{
    int numberOfWheels;
    int fuel;

    public AbstractGround(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuel) {
        super(power, maxSpeed, weight, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuel = fuel;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" numberOfWheels=" + numberOfWheels +
                ", fuel=" + fuel);

    }
}
