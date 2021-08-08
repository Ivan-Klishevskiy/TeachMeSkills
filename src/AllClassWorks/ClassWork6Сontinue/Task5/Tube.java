package AllClassWorks.ClassWork6Сontinue.Task5;

public class Tube implements Tools{
    private int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Play tube с характеристиками "+diameter);
    }
}
