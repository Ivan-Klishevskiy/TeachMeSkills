package AllClassWorks.ClassWork6Сontinue.Task5;

public class Drum implements Tools{
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Play drum с характеристиками "+size);
    }
}
