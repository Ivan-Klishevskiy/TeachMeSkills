package AllClassWorks.ClassWork6continue.Task3;

public abstract class SolidOfRevolution extends Shape{
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
