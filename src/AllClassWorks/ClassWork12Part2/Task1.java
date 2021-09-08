package AllClassWorks.ClassWork12Part2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель");
        set.forEach(System.out::println);
    }
}
