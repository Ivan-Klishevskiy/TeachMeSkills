package Unit6;

public class Passenger extends AbstractGround {
    String bodyType;
    int numberOfPassengers;

    public Passenger(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuel, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuel);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void show() {
        System.out.println("Passenger:");
        super.show();
        System.out.println(
                " bodyType='" + bodyType +
                        ", numberOfPassengers=" + numberOfPassengers + "power = " + (power * 0.74));
    }

    public void range(int time) {
        System.out.println("За время " + time +
                " ч, автомобиль " +
                mark + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " + (time * maxSpeed) +
                " км  и израсходует " + this.expenditure(time) + " литров топлива.");
    }

    private int expenditure(int time) {
        return ((time * maxSpeed) / fuel);
    }
}
