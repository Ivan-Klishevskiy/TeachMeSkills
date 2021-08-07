package AllClassWorks.ClassWork8.Task2;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Такое-то животное шумит ");
    }

    public void eat(){
        System.out.println("Такое-то животное ест ");
    }

    public void sleep(){
        System.out.println("Такое-то животное спит");
    }
}
