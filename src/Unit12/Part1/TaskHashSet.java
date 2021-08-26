package Unit12.Part1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("7");
        set.add("9");
        set.add("6");

        System.out.println(set.size());
        System.out.println(set);
    }
}
