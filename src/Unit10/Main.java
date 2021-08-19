package Unit10;

public class Main {
    public static void main(String[] args) {
        Car []arr=new Car[2];
        arr[0]=new Car("BMW", 250, 37000);
        arr[1]=new Car("Tesla", 400, 29950);

        for (Car car : arr) {
            try {
                car.start();
            } catch (ErrorStartException e) {
                e.printStackTrace();
            }
        }
    }
}
