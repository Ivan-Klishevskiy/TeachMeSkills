package AllClassWorks.ClassWork13Part2;

import java.util.Random;
import java.util.function.Supplier;

public class Task7 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> {
            Random random=new Random();
            return random.nextInt(11);
        };
        System.out.println(supplier.get());
    }
}
