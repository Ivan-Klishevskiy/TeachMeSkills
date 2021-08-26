package AllClassWorks.ClassWork12;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("дыня");
        set.add("женьшень");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
