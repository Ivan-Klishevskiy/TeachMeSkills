package AllClassWorks.ClassWork8.Task2;

public class Dog extends Animal{
    int power;

    public Dog(String food, String location, int power) {
        super(food, location);
        this.power = power;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака шумит ");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест ");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит ");
    }
}
