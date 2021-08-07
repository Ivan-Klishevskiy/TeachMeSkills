package AllClassWorks.ClassWork6continue.Task4;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    static void printMagazines(Printable[] printable){
        for(Printable i:printable) {
            if (i instanceof Magazine) {
                i.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
