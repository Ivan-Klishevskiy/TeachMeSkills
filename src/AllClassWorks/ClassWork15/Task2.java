package AllClassWorks.ClassWork15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        Collections.addAll(list,"Bobo","Dodo","Jojo","Jona","Jira","Ggfd");
        list
                .stream()
                .filter(s -> s.startsWith("J")).
                forEach(System.out::println);
    }
}
