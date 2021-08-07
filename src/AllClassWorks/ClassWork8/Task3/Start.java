package AllClassWorks.ClassWork8.Task3;

public class Start {
    public static void main(String[] args) {
        Shape []shapeArr=new Shape[2];
        shapeArr[0]=new Circle("Red",5);
        shapeArr[1]=new Rectangle("Blue",9);
        for(Shape shape:shapeArr){
            shape.draw();
        }
    }
}
