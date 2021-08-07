package AllClassWorks.ClassWork8.Task3;

import java.util.Objects;

public class Circle extends Shape{
    private int coordinates;

    public Circle(String color, int coordinates) {
        super(color);
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return coordinates == circle.coordinates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
