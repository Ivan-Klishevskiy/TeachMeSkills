package Unit10;

import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int price;
    private Random random;

    public Car() {
        this("", 0, 0);
    }

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
        random = new Random();
    }

    public void start() throws ErrorStartException {
        if (random.nextInt(21) % 2 == 0) {
            throw new ErrorStartException("ErrorStartException " + mark);
        }
        System.out.println("Aвтомобиль с маркой: " + mark + " завелся");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
