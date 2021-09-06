package AllClassWorks.ClassWork13Part2;

interface Printable{
    void print();
}


public class Task1 {
    public static void main(String[] args) {
        Printable printable = ()-> System.out.println("Hello world");
        printable.print();
    }
}
