package Unit10;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 250, 37000);
        Car tesla = new Car("Tesla", 400, 29950);

        try {
            bmw.start();
        } catch (ErrorStartException e) {
            e.printStackTrace();
        }

        try {
            tesla.start();
        } catch (ErrorStartException e) {
            e.printStackTrace();
        }

    }
}
