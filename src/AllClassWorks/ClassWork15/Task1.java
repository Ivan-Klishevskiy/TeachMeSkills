package AllClassWorks.ClassWork15;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        long count = new Random().ints(15,0,100).filter(x->x%2==0).count();
        System.out.println(count);
    }
}
