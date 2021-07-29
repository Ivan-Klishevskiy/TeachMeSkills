package Unit6;

public abstract class AbstractTransport {
    int power;
    int maxSpeed;
    int weight;
    String mark;

    public AbstractTransport(int power, int maxSpeed, int weight, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public void show() {
        System.out.print("power=" + power +
                ", MaxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark='" + mark+ "' ");
    }
}


