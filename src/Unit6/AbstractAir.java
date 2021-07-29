package Unit6;

public abstract class AbstractAir extends AbstractTransport{
    int wingspan;
    int lengthOfTheRunway;

    public AbstractAir(int wingspan, int lengthOfTheRunway, int power, int maxSpeed, int weight, String mark) {
        super(power, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.lengthOfTheRunway = lengthOfTheRunway;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" wingspan=" + wingspan +
                ", lengthOfTheRunway=" + lengthOfTheRunway );
    }
}
