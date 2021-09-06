package AllClassWorks.ClassWork13Part2;

import java.util.Objects;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate predicate= obj -> Objects.isNull(obj);
        String txt=null;
        System.out.println(predicate.test(txt));
    }
}
