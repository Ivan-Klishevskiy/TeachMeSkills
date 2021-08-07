package AllClassWorks.ClassWork8.Task2;

public class Cat extends Animal{
    private String breed;

    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот шумит ");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест ");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит ");
    }
}
