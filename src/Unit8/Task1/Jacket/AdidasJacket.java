package Unit8.Task1.Jacket;

public class AdidasJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Одевает куртку Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Adidas");
    }
}
