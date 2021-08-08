package Unit8.Task1.Jacket;

public class NikeJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Одевает куртку Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Nike");
    }
}
