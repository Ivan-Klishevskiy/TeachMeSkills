package AllClassWorks.ClassWork6continue.Task4;

public class Book implements  Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    static void printBooks(Printable[] printable) {
        for(Printable i:printable) {
            if (i instanceof Book) {
                i.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Printable[]printables=new Printable[4];
        printables[0]=new Book("thisFirstBook");
        printables[1]=new Magazine("thisFirstMagazine");
        printables[2]=new Book("thisSecondBook");
        printables[3]=new Magazine("thisSecondMagazine");

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
