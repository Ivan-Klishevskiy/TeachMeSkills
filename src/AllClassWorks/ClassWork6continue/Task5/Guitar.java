package AllClassWorks.ClassWork6continue.Task5;

public class Guitar implements Tools {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Play guitar с характеристиками " + numberOfStrings);
    }

    public static void main(String[] args) {
        Tools[] tools = new Tools[3];
        tools[0] = new Guitar(10);
        tools[1] = new Drum(250);
        tools[2] = new Tube(90);

        for (Tools i : tools) {
            i.play();
        }
    }
}
