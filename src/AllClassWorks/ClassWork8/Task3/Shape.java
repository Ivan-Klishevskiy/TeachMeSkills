package AllClassWorks.ClassWork8.Task3;

public abstract class Shape {
    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    abstract public void draw();
}
