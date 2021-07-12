package Unit1;

public class Unit1Task5 {
    public static void main(String[] args) {
        int a = 5;
        int b = -3;
        int c = 10;
        int count=0;

        if(a>=0)
            count++;
        if(b>=0)
            count++;
        if(c>=0)
            count++;
        System.out.println("Положительных "+count);
        System.out.println("Отрицательных "+(3-count));
    }
}
