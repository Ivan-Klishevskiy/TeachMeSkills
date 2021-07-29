package Unit6;

public class Civil extends AbstractAir {
    int numberOfPassengers;
    boolean businessClass;

    public Civil(int wingspan, int lengthOfTheRunway, int power, int maxSpeed, int weight, String mark, int numberOfPassengers, boolean businessClass) {
        super(wingspan, lengthOfTheRunway, power, maxSpeed, weight, mark);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }


    @Override
    public void show() {
        System.out.println("Civil:");
        super.show();
        System.out.print(" numberOfPassengers=" + numberOfPassengers +
                ", businessClass=" + businessClass + "power = " + (power * 0.74));
    }

    public void checkPassenger(int CountPassengers) {
        if (numberOfPassengers >= CountPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше ");
        }
    }


}
