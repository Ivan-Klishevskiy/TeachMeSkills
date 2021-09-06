package AllClassWorks.ClassWork13Part2;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> checkNull = i->i==null;
        Predicate<String> checkIsEmpty = x->x.isEmpty();
        System.out.println(checkIsEmpty.and(checkNull).test("gr"));
    }
}
