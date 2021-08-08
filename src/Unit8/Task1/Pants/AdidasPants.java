package Unit8.Task1.Pants;

public class AdidasPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Одевает штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Adidas");
    }
}
