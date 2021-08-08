package Unit8.Task1.Shoes;

public class AdidasShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Одевает обувь Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Adidas");
    }
}
