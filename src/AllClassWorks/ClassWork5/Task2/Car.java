package AllClassWorks.classwork5.Task2;

public class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name=name;
        this.speed=speed;
    }

    void show() {
        System.out.println("Speed = " + speed + " name = " + name);
    }
}
