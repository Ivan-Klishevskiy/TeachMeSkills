package AllClassWorks.ClassWork6continue.Task3;

public class Box extends Shape {
    private Shape[] arr;
    int index;

    public Box(double volume) {
        super(volume);
        this.arr = new Shape[1];
        this.index = 0;
    }

    public boolean add(Shape shape) {
        if (this.getVolume() > shape.getVolume()) {
            this.setVolume(this.getVolume()- shape.getVolume());
            if (index == arr.length) {
                Shape[] copyArr = new Shape[arr.length * 2];
                int step = 0;
                for (Shape i : arr) {
                    copyArr[step] = i;
                    step++;
                }
                copyArr[step] = shape;
                arr = copyArr;
                index = step;
            } else {
                arr[index] = shape;
                index++;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Box box=new Box(450);
        Cylinder cylinder=new Cylinder(150,20,3);
        Pyramid pyramid=new Pyramid(100,12,5);
        Ball ball=new Ball(100,25);
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(ball));
    }
}
