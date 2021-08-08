package Unit8.Task1.Pants;

public class NikePants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Одевает штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Nike");
    }
}
