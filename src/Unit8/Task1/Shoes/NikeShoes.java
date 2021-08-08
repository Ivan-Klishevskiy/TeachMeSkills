package Unit8.Task1.Shoes;

public class NikeShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Одевает обувь Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Nike");
    }
}
