package AllClassWorks.ClassWork13Part2;

import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
        Function<Integer, String> func = i -> {
            if (i > 0) {
                return "Число положительное";
            }
            if (i < 0) {
                return "Число отрицательное";
            }
            return "Ноль";
        };
        System.out.println(func.apply(99));
    }
}
