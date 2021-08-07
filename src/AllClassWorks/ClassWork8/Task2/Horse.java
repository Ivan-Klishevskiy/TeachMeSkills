package AllClassWorks.ClassWork8.Task2;

public class Horse extends Animal{
    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь шумит ");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест ");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит ");
    }

}
