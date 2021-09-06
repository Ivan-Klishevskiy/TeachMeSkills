package AllClassWorks.ClassWork13Part2;


public class Task8 {
    private static void printMessage(Printable func) {
        func.print();
    }

    public static void main(String[] args) {
        printMessage(() -> System.out.println("First"));
        printMessage(() -> System.out.println("Second"));
    }
}
