package AllClassWorks.ClassWork8.Task3;

import java.util.Objects;

public class Rectangle extends Shape{
    private int coordinates;

    public Rectangle(String color, int coordinates) {
        super(color);
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return coordinates == rectangle.coordinates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
